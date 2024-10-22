import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class SnakeGame extends JFrame {

    private final int WIDTH = 300;
    private final int HEIGHT = 300;
    private final int UNIT_SIZE = 10;
    private final int TOTAL_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private final int DELAY = 140;
    private final int[] x = new int[TOTAL_UNITS];
    private final int[] y = new int[TOTAL_UNITS];
    private int bodyParts = 3;
    private int foodX;
    private int foodY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    public SnakeGame() {
        initBoard();
    }

    private void initBoard() {
        add(new GamePanel());
        setTitle("Snake Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private class GamePanel extends JPanel implements ActionListener {

        public GamePanel() {
            random = new Random();
            setBackground(Color.BLACK);
            setFocusable(true);
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_LEFT:
                            if (direction != 'R')
                                direction = 'L';
                            break;
                        case KeyEvent.VK_RIGHT:
                            if (direction != 'L')
                                direction = 'R';
                            break;
                        case KeyEvent.VK_UP:
                            if (direction != 'D')
                                direction = 'U';
                            break;
                        case KeyEvent.VK_DOWN:
                            if (direction != 'U')
                                direction = 'D';
                            break;
                    }
                }
            });
            startGame();
        }

        private void startGame() {
            running = true;
            placeFood();
            timer = new Timer(DELAY, this);
            timer.start();
        }

        private void placeFood() {
            foodX = random.nextInt((int) (WIDTH / UNIT_SIZE)) * UNIT_SIZE;
            foodY = random.nextInt((int) (HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        }

        private void move() {
            for (int i = bodyParts; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];
            }

            switch (direction) {
                case 'U':
                    y[0] = y[0] - UNIT_SIZE;
                    break;
                case 'D':
                    y[0] = y[0] + UNIT_SIZE;
                    break;
                case 'L':
                    x[0] = x[0] - UNIT_SIZE;
                    break;
                case 'R':
                    x[0] = x[0] + UNIT_SIZE;
                    break;
            }
        }

        private void checkFood() {
            if (x[0] == foodX && y[0] == foodY) {
                bodyParts++;
                placeFood();
            }
        }

        private void checkCollisions() {
            for (int i = bodyParts; i > 0; i--) {
                if (x[0] == x[i] && y[0] == y[i]) {
                    running = false;
                }
            }

            if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
                running = false;
            }

            if (!running) {
                timer.stop();
            }
        }

        private void gameOver(Graphics g) {
            String message = "Game Over";
            Font font = new Font("Helvetica", Font.BOLD, 20);
            FontMetrics metrics = getFontMetrics(font);
            g.setColor(Color.WHITE);
            g.setFont(font);
            g.drawString(message, (WIDTH - metrics.stringWidth(message)) / 2, HEIGHT / 2);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (running) {
                g.setColor(Color.RED);
                g.fillRect(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

                for (int i = 0; i < bodyParts; i++) {
                    if (i == 0) {
                        g.setColor(Color.GREEN);
                    } else {
                        g.setColor(Color.YELLOW);
                    }
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }

                Toolkit.getDefaultToolkit().sync();
            } else {
                gameOver(g);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (running) {
                move();
                checkFood();
                checkCollisions();
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeGame();
            ex.setVisible(true);
        });
    }
}
