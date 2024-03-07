import Domain.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainFrame extends JFrame {

    private JList<Product> productList;
    private DefaultListModel<Product> listModel;
    private JTextField moneyInput;
    private JButton buyButton;
    private JLabel messageLabel;

    public MainFrame() {
        setTitle("Vending Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();
        productList = new JList<>(listModel);
        productList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane listScrollPane = new JScrollPane(productList);

        moneyInput = new JTextField();
        buyButton = new JButton("Купить товар");
        messageLabel = new JLabel();

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buyButtonClicked();
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(8, 128, 255));
        mainPanel.add(listScrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Внесите деньги: "));
        inputPanel.add(moneyInput);
        inputPanel.add(buyButton);
        inputPanel.add(messageLabel);

        mainPanel.add(inputPanel, BorderLayout.SOUTH);


        add(mainPanel);
    }

    public void initialize(List<Product> products) {
        for (Product product : products) {
            listModel.addElement(product);
        }

        setVisible(true);
    }

    private void buyButtonClicked() {
        int selectedIndex = productList.getSelectedIndex();

        if (selectedIndex != -1) {
            Product selectedProduct = listModel.getElementAt(selectedIndex);
            listModel.remove(selectedIndex);

            messageLabel.setText("Пожалуйста, заберите ваш товар: " + selectedProduct.getName());
            messageLabel.setForeground(Color.BLUE);
        } else {
            messageLabel.setText("Выберите товар перед покупкой");
            messageLabel.setForeground(Color.RED);
        }
    }
}




// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MainFrame extends JFrame {

//     private final Font mainFont = new Font("Arial", Font.BOLD, 18);
//     private JTextField tfProductNumber;
//     private JLabel lbWelcome;
//     private JTextArea taProducts;

//     private boolean paymentReceived = false;

//     public void initialize() {
//         JLabel lbSelectProduct = new JLabel("Enter the number of the desired product: ");
//         lbSelectProduct.setFont(mainFont);

//         tfProductNumber = new JTextField();
//         tfProductNumber.setFont(mainFont);

//         taProducts = new JTextArea();
//         taProducts.setEditable(false);
//         taProducts.setFont(mainFont);

//         JPanel formPanel = new JPanel();
//         formPanel.setLayout(new GridLayout(2, 2, 5, 5));
//         formPanel.add(lbSelectProduct);
//         formPanel.add(tfProductNumber);

//         lbWelcome = new JLabel();
//         lbWelcome.setFont(mainFont);

//         JButton btnOk = new JButton("OK");
//         btnOk.setFont(mainFont);
//         btnOk.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 if (paymentReceived) {
//                     lbWelcome.setText("Please take your order!");
//                 } else {
//                     String selectedProduct = tfProductNumber.getText();
                    
//                     // Perform actions based on the entered product number
//                     processSelectedProduct(selectedProduct);
//                 }
//             }
//         });

//         JButton btnClear = new JButton("CANCEL");
//         btnClear.setFont(mainFont);
//         btnClear.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 lbWelcome.setText("");
//                 paymentReceived = false;
//             }
//         });

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
//         buttonPanel.add(btnOk);
//         buttonPanel.add(btnClear);

//         JPanel mainPanel = new JPanel();
//         mainPanel.setLayout(new BorderLayout());
//         mainPanel.setBackground(new Color(8, 128, 255));

//         mainPanel.add(formPanel, BorderLayout.NORTH);
//         mainPanel.add(lbWelcome, BorderLayout.CENTER);
//         mainPanel.add(buttonPanel, BorderLayout.SOUTH);
//         mainPanel.add(new JScrollPane(taProducts), BorderLayout.WEST);

//         add(mainPanel);

//         mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//         formPanel.setOpaque(false);
//         buttonPanel.setOpaque(false);

//         setTitle("VendingMachine");
//         setSize(800, 400);
//         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//         setVisible(true);

//         // Display the list of products on startup
//         updateProductList();
//     }

//     private void processSelectedProduct(String selectedProduct) {
//         if (!selectedProduct.isEmpty() && isNumeric(selectedProduct)) {
//             int productNumber = Integer.parseInt(selectedProduct);
            
//             if (productNumber > 0 && productNumber <= taProducts.getLineCount()) {
//                 lbWelcome.setText("You selected product number " + productNumber + "\nPlease make a payment!");
//             } else {
//                 lbWelcome.setText("Invalid product number. Please enter a valid number.");
//             }
//         } else {
//             lbWelcome.setText("Please enter a valid product number.");
//         }
//     }

//     private void updateProductList() {
//         taProducts.setText("Available Products:\n");
//         String[] products = {"Lays", "Nuts", "Mars", "Cola", "Mineral", "Espresso", "Cappuccino", "Mocha"};
//         for (int i = 0; i < products.length; i++) {
//             taProducts.append((i + 1) + ". " + products[i] + "\n");
//         }
//     }

//     private boolean isNumeric(String str) {
//         try {
//             Integer.parseInt(str);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             MainFrame myFrame = new MainFrame();
//             myFrame.initialize();
//         });
//     }
// }





// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.*;

// public class MainFrame extends JFrame {
    
    
//     final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
//     JTextField tfFirstName, tfLastName;
    
    
//     JLabel lbWelcome;

//     public void initialize() {
       
        
//         JLabel lbFirstName = new JLabel("First Name");
//         lbFirstName.setFont(mainFont);

//         tfFirstName = new JTextField();
//         tfFirstName.setFont(mainFont);
        
        
//         JLabel lbLastName = new JLabel("First Name");
//         lbLastName.setFont(mainFont);

       
        
//         tfLastName = new JTextField();
//         tfLastName.setFont(mainFont);

        
        
//         JPanel formPanel = new JPanel();
//         formPanel.setLayout(new GridLayout(4, 1, 5, 5));
//         formPanel.add(lbFirstName);
//         formPanel.add(tfFirstName);
//         formPanel.add(lbLastName);
//         formPanel.add(tfLastName);
        
        
//         lbWelcome = new JLabel();
//         lbWelcome.setFont(mainFont);

        
        
//         JButton btnOk = new JButton("Ok");
//         btnOk.setFont(mainFont);
//         btnOk.addActionListener(new ActionListener() {

//             @Override
//             public void actionPerformed(ActionEvent e) {
                
                
//                 String firstName = tfFirstName.getText();
//                 String lastName = tfFirstName.getText();
//                 lbWelcome.setText("Hello " + firstName + " " + lastName);
                
                
//             }

//         });

       
//         JButton btnClear = new JButton("Clear");
//         btnClear.setFont(mainFont);
//         btnClear.addActionListener(new ActionListener() {

//             @Override
//             public void actionPerformed(ActionEvent e) {
               
//                 tfFirstName.setText("");
//                 tfFirstName.setText("");
//                 lbWelcome.setText("");
                
//             }

//         });

        
//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
//         buttonPanel.add(btnOk);
//         buttonPanel.add(btnClear);

        
//         JPanel mainPanel = new JPanel();
//         mainPanel.setLayout(new BorderLayout());
//         mainPanel.setBackground(new Color(128, 128, 255));
        
//         mainPanel.add(formPanel, BorderLayout.NORTH);

        
//         mainPanel.add(lbWelcome, BorderLayout.CENTER);

        
//         mainPanel.add(buttonPanel, BorderLayout.SOUTH);

       
//         add(mainPanel);

        
//         mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//         formPanel.setOpaque(false);
//         buttonPanel.setOpaque(false);

        
//         setTitle("VendingMachines");
//         setSize(500, 600);
//         setMaximumSize(new Dimension(300, 400));
//         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     public static void main(String[] arg)
//     {
//         MainFrame myFrame = new MainFrame();
//         myFrame.initialize();
//     }

// }
