package View;

import javax.swing.JPanel;
import Controller.*;
import DAO.UserDAO;
import Model.*;
import Utilities.Validation;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.*;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class MainFrame extends javax.swing.JFrame {

    static ChartPanel chartPanel = null;
    public static User curUser = null;
    Validation inputVerifier = new Validation();

    public MainFrame(User user) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        initComponents();
        setRoundComponents();
        setValidation();
        loadDashboard();
        curUser = UserDAO.LoadCurrentUser(user);

        helloLable.setText(curUser.getUsername());

//        switchLayer(DashboardLayer);
        activatePanel(DashboardPanel);
        UserDAO.loadAccountInfo(accEmail, accFirstname, accLastname, curUser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        helloLable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MainMenu = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        DashboardPanel = new javax.swing.JPanel();
        dbText = new javax.swing.JLabel();
        ProductsPanel = new javax.swing.JPanel();
        productsText = new javax.swing.JLabel();
        CategoriesPanel = new javax.swing.JPanel();
        categoriesText = new javax.swing.JLabel();
        BrandsPanel = new javax.swing.JPanel();
        brandsText = new javax.swing.JLabel();
        UsersPanel = new javax.swing.JPanel();
        usersText = new javax.swing.JLabel();
        EditAccountPanel = new javax.swing.JPanel();
        editText = new javax.swing.JLabel();
        layerPanel = new javax.swing.JPanel();
        DashboardLayer = new javax.swing.JPanel();
        dbPanel = new javax.swing.JPanel();
        ProductsLayer = new javax.swing.JPanel();
        productMeta = new javax.swing.JPanel();
        productName = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productCategory = new javax.swing.JComboBox<>();
        productBrand = new javax.swing.JComboBox<>();
        productAdd = new javax.swing.JButton();
        productUpdate = new javax.swing.JButton();
        productDelete = new javax.swing.JButton();
        productClear = new javax.swing.JButton();
        productSearchField = new javax.swing.JTextField();
        productImportBtn = new javax.swing.JButton();
        productExportBtn = new javax.swing.JButton();
        productQuantity = new javax.swing.JTextField();
        productId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        test1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        CategoriesLayer = new javax.swing.JPanel();
        categoryMeta = new javax.swing.JPanel();
        categoryId = new javax.swing.JTextField();
        categoryName = new javax.swing.JTextField();
        categoryAdd = new javax.swing.JButton();
        categoryUpdate = new javax.swing.JButton();
        categoryDelete = new javax.swing.JButton();
        categoryClear = new javax.swing.JButton();
        categorySearchField = new javax.swing.JTextField();
        categoryImportBtn = new javax.swing.JButton();
        categoryExportBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CategoryScrollPane = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        BrandsLayer = new javax.swing.JPanel();
        brandMeta = new javax.swing.JPanel();
        brandId = new javax.swing.JTextField();
        brandName = new javax.swing.JTextField();
        brandAdd = new javax.swing.JButton();
        brandUpdate = new javax.swing.JButton();
        brandDelete = new javax.swing.JButton();
        brandClear = new javax.swing.JButton();
        brandImportBtn = new javax.swing.JButton();
        brandExportBtn = new javax.swing.JButton();
        brandSearchField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        brandTable = new javax.swing.JTable();
        UsersLayer = new javax.swing.JPanel();
        userMeta = new javax.swing.JPanel();
        userFirstname = new javax.swing.JTextField();
        userLastname = new javax.swing.JTextField();
        userEmail = new javax.swing.JTextField();
        userDelete = new javax.swing.JButton();
        userClear = new javax.swing.JButton();
        userUsername = new javax.swing.JTextField();
        userAdd = new javax.swing.JButton();
        userUpdate = new javax.swing.JButton();
        userPassword = new javax.swing.JTextField();
        userImportBtn = new javax.swing.JButton();
        userExportBtn = new javax.swing.JButton();
        userSearchField = new javax.swing.JTextField();
        userId = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        EditAccountLayer = new javax.swing.JPanel();
        accMeta = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        accFirstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        accLastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updateInfo = new javax.swing.JButton();
        accEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accPassMeta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        accOldPass = new javax.swing.JTextField();
        accNewPass = new javax.swing.JTextField();
        accConfirmNewPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        updatePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));

        mainPanel.setBackground(new java.awt.Color(240, 242, 245));
        mainPanel.setMinimumSize(new java.awt.Dimension(1200, 700));
        mainPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        mainPanel.setLayout(new java.awt.BorderLayout());

        topBar.setBackground(new java.awt.Color(29, 35, 42));
        topBar.setMinimumSize(new java.awt.Dimension(1000, 50));
        topBar.setPreferredSize(new java.awt.Dimension(1000, 50));
        topBar.setLayout(new javax.swing.BoxLayout(topBar, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  RepositoryManagement");
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 23));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 23));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 23));
        topBar.add(jLabel1);

        jLabel16.setMaximumSize(new java.awt.Dimension(550, 16));
        jLabel16.setMinimumSize(new java.awt.Dimension(550, 16));
        jLabel16.setPreferredSize(new java.awt.Dimension(550, 16));
        topBar.add(jLabel16);

        helloLable.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        helloLable.setForeground(new java.awt.Color(255, 255, 255));
        helloLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Profile32.png"))); // NOI18N
        helloLable.setText("Hello, ");
        helloLable.setMaximumSize(new java.awt.Dimension(200, 32));
        helloLable.setMinimumSize(new java.awt.Dimension(200, 32));
        helloLable.setPreferredSize(new java.awt.Dimension(200, 32));
        helloLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helloLableMouseClicked(evt);
            }
        });
        topBar.add(helloLable);

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogOut32.png"))); // NOI18N
        jLabel2.setText("Logout");
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 32));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 32));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        topBar.add(jLabel2);

        mainPanel.add(topBar, java.awt.BorderLayout.NORTH);

        MainMenu.setBackground(new java.awt.Color(48, 66, 106));
        MainMenu.setPreferredSize(new java.awt.Dimension(199, 200));

        jPanel7.setBackground(new java.awt.Color(48, 66, 106));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        MainMenu.add(jPanel7);

        DashboardPanel.setBackground(new java.awt.Color(48, 66, 106));
        DashboardPanel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DashboardPanel.setPreferredSize(new java.awt.Dimension(200, 60));
        DashboardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardPanelMouseClicked(evt);
            }
        });

        dbText.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        dbText.setForeground(new java.awt.Color(255, 255, 255));
        dbText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home25.png"))); // NOI18N
        dbText.setText("Dashboard");
        dbText.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(dbText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dbText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        MainMenu.add(DashboardPanel);

        ProductsPanel.setBackground(new java.awt.Color(48, 66, 106));
        ProductsPanel.setPreferredSize(new java.awt.Dimension(200, 60));
        ProductsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsPanelMouseClicked(evt);
            }
        });

        productsText.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        productsText.setForeground(new java.awt.Color(255, 255, 255));
        productsText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Product25.png"))); // NOI18N
        productsText.setText("Products");
        productsText.setMaximumSize(new java.awt.Dimension(32, 32));
        productsText.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout ProductsPanelLayout = new javax.swing.GroupLayout(ProductsPanel);
        ProductsPanel.setLayout(ProductsPanelLayout);
        ProductsPanelLayout.setHorizontalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(productsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        ProductsPanelLayout.setVerticalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(productsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        MainMenu.add(ProductsPanel);

        CategoriesPanel.setBackground(new java.awt.Color(48, 66, 106));
        CategoriesPanel.setPreferredSize(new java.awt.Dimension(200, 60));
        CategoriesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesPanelMouseClicked(evt);
            }
        });

        categoriesText.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        categoriesText.setForeground(new java.awt.Color(255, 255, 255));
        categoriesText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Category25.png"))); // NOI18N
        categoriesText.setText("Categories");
        categoriesText.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout CategoriesPanelLayout = new javax.swing.GroupLayout(CategoriesPanel);
        CategoriesPanel.setLayout(CategoriesPanelLayout);
        CategoriesPanelLayout.setHorizontalGroup(
            CategoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CategoriesPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(categoriesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        CategoriesPanelLayout.setVerticalGroup(
            CategoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(categoriesText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        MainMenu.add(CategoriesPanel);

        BrandsPanel.setBackground(new java.awt.Color(48, 66, 106));
        BrandsPanel.setPreferredSize(new java.awt.Dimension(200, 60));
        BrandsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrandsPanelMouseClicked(evt);
            }
        });

        brandsText.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        brandsText.setForeground(new java.awt.Color(255, 255, 255));
        brandsText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Brand25.png"))); // NOI18N
        brandsText.setText("Brands");
        brandsText.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout BrandsPanelLayout = new javax.swing.GroupLayout(BrandsPanel);
        BrandsPanel.setLayout(BrandsPanelLayout);
        BrandsPanelLayout.setHorizontalGroup(
            BrandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BrandsPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(brandsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        BrandsPanelLayout.setVerticalGroup(
            BrandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrandsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(brandsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        MainMenu.add(BrandsPanel);

        UsersPanel.setBackground(new java.awt.Color(48, 66, 106));
        UsersPanel.setPreferredSize(new java.awt.Dimension(200, 60));
        UsersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersPanelMouseClicked(evt);
            }
        });

        usersText.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        usersText.setForeground(new java.awt.Color(255, 255, 255));
        usersText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User25.png"))); // NOI18N
        usersText.setText("Users");
        usersText.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout UsersPanelLayout = new javax.swing.GroupLayout(UsersPanel);
        UsersPanel.setLayout(UsersPanelLayout);
        UsersPanelLayout.setHorizontalGroup(
            UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(usersText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        UsersPanelLayout.setVerticalGroup(
            UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(usersText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        MainMenu.add(UsersPanel);

        EditAccountPanel.setBackground(new java.awt.Color(48, 66, 106));
        EditAccountPanel.setPreferredSize(new java.awt.Dimension(200, 60));
        EditAccountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAccountPanelMouseClicked(evt);
            }
        });

        editText.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        editText.setForeground(new java.awt.Color(255, 255, 255));
        editText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditAccount25.png"))); // NOI18N
        editText.setText("Edit Account");
        editText.setMaximumSize(new java.awt.Dimension(100, 32));
        editText.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout EditAccountPanelLayout = new javax.swing.GroupLayout(EditAccountPanel);
        EditAccountPanel.setLayout(EditAccountPanelLayout);
        EditAccountPanelLayout.setHorizontalGroup(
            EditAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditAccountPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(editText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        EditAccountPanelLayout.setVerticalGroup(
            EditAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditAccountPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(editText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        MainMenu.add(EditAccountPanel);

        mainPanel.add(MainMenu, java.awt.BorderLayout.WEST);

        layerPanel.setBackground(new java.awt.Color(18, 23, 28));
        layerPanel.setPreferredSize(new java.awt.Dimension(1000, 650));
        layerPanel.setLayout(new java.awt.CardLayout());

        DashboardLayer.setBackground(new java.awt.Color(18, 23, 28));
        DashboardLayer.setMinimumSize(new java.awt.Dimension(1000, 650));
        DashboardLayer.setPreferredSize(new java.awt.Dimension(1000, 650));
        DashboardLayer.setRequestFocusEnabled(false);
        DashboardLayer.setLayout(new java.awt.BorderLayout());

        dbPanel.setOpaque(false);
        dbPanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        javax.swing.GroupLayout dbPanelLayout = new javax.swing.GroupLayout(dbPanel);
        dbPanel.setLayout(dbPanelLayout);
        dbPanelLayout.setHorizontalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
        );
        dbPanelLayout.setVerticalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        DashboardLayer.add(dbPanel, java.awt.BorderLayout.CENTER);

        layerPanel.add(DashboardLayer, "DashboardCard");
        DashboardLayer.getAccessibleContext().setAccessibleName("");

        ProductsLayer.setBackground(new java.awt.Color(18, 23, 28));
        ProductsLayer.setMinimumSize(new java.awt.Dimension(1000, 650));
        ProductsLayer.setPreferredSize(new java.awt.Dimension(1000, 650));
        ProductsLayer.setRequestFocusEnabled(false);

        productMeta.setBackground(new java.awt.Color(100, 120, 145));
        productMeta.setForeground(new java.awt.Color(255, 255, 255));
        productMeta.setMinimumSize(new java.awt.Dimension(960, 160));
        productMeta.setPreferredSize(new java.awt.Dimension(960, 160));

        productName.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productName.setMaximumSize(null);
        productName.setMinimumSize(new java.awt.Dimension(150, 25));
        productName.setName(""); // NOI18N
        productName.setPreferredSize(new java.awt.Dimension(150, 25));

        productPrice.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productPrice.setMaximumSize(null);
        productPrice.setMinimumSize(new java.awt.Dimension(150, 25));
        productPrice.setName(""); // NOI18N
        productPrice.setPreferredSize(new java.awt.Dimension(150, 25));

        productCategory.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category" }));
        productCategory.setMaximumSize(null);
        productCategory.setMinimumSize(new java.awt.Dimension(120, 25));
        productCategory.setName(""); // NOI18N
        productCategory.setPreferredSize(new java.awt.Dimension(120, 25));

        productBrand.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brand" }));
        productBrand.setMaximumSize(null);
        productBrand.setMinimumSize(new java.awt.Dimension(120, 25));
        productBrand.setName(""); // NOI18N
        productBrand.setPreferredSize(new java.awt.Dimension(120, 25));

        productAdd.setBackground(new java.awt.Color(0, 112, 242));
        productAdd.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        productAdd.setForeground(new java.awt.Color(255, 255, 255));
        productAdd.setText("Add");
        productAdd.setPreferredSize(new java.awt.Dimension(75, 25));
        productAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAddActionPerformed(evt);
            }
        });

        productUpdate.setBackground(new java.awt.Color(0, 112, 242));
        productUpdate.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        productUpdate.setForeground(new java.awt.Color(255, 255, 255));
        productUpdate.setText("Update");
        productUpdate.setPreferredSize(new java.awt.Dimension(75, 25));
        productUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productUpdateActionPerformed(evt);
            }
        });

        productDelete.setBackground(new java.awt.Color(0, 112, 242));
        productDelete.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        productDelete.setForeground(new java.awt.Color(255, 255, 255));
        productDelete.setText("Delete");
        productDelete.setPreferredSize(new java.awt.Dimension(75, 25));
        productDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productDeleteActionPerformed(evt);
            }
        });

        productClear.setBackground(new java.awt.Color(0, 112, 242));
        productClear.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        productClear.setForeground(new java.awt.Color(255, 255, 255));
        productClear.setText("Clear");
        productClear.setPreferredSize(new java.awt.Dimension(75, 25));
        productClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productClearActionPerformed(evt);
            }
        });

        productSearchField.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productSearchField.setText("Search Here");
        productSearchField.setMaximumSize(null);
        productSearchField.setMinimumSize(new java.awt.Dimension(120, 25));
        productSearchField.setName(""); // NOI18N
        productSearchField.setPreferredSize(new java.awt.Dimension(120, 25));
        productSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productSearchFieldKeyReleased(evt);
            }
        });

        productImportBtn.setBackground(new java.awt.Color(0, 112, 242));
        productImportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        productImportBtn.setForeground(new java.awt.Color(255, 255, 255));
        productImportBtn.setText("Import");
        productImportBtn.setMinimumSize(new java.awt.Dimension(120, 25));
        productImportBtn.setName(""); // NOI18N
        productImportBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        productImportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productImportBtnActionPerformed(evt);
            }
        });

        productExportBtn.setBackground(new java.awt.Color(0, 112, 242));
        productExportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        productExportBtn.setForeground(new java.awt.Color(255, 255, 255));
        productExportBtn.setText("Export");
        productExportBtn.setMinimumSize(new java.awt.Dimension(120, 25));
        productExportBtn.setName(""); // NOI18N
        productExportBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        productExportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productExportBtnActionPerformed(evt);
            }
        });

        productQuantity.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productQuantity.setMaximumSize(null);
        productQuantity.setMinimumSize(new java.awt.Dimension(120, 25));
        productQuantity.setName(""); // NOI18N
        productQuantity.setPreferredSize(new java.awt.Dimension(120, 25));

        productId.setEditable(false);
        productId.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productId.setToolTipText("");
        productId.setFocusable(false);
        productId.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id");

        jLabel11.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name");

        jLabel14.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");

        jLabel15.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantity");

        javax.swing.GroupLayout productMetaLayout = new javax.swing.GroupLayout(productMeta);
        productMeta.setLayout(productMetaLayout);
        productMetaLayout.setHorizontalGroup(
            productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productMetaLayout.createSequentialGroup()
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productMetaLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(productAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(productUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(productDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(productClear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productMetaLayout.createSequentialGroup()
                        .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productMetaLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(productMetaLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productMetaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(productBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(productImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(productMetaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productExportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        productMetaLayout.setVerticalGroup(
            productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productMetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(8, 8, 8)
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(productMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        test1.setBackground(new java.awt.Color(100, 120, 145));
        test1.setForeground(new java.awt.Color(255, 255, 255));
        test1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        test1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        productTable.setBackground(new java.awt.Color(100, 120, 145));
        productTable.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        productTable.setForeground(new java.awt.Color(255, 255, 255));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Quantity", "Categogy", "Brand", "Post By", "Last Update"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        productTable.setMinimumSize(new java.awt.Dimension(960, 410));
        productTable.setShowGrid(true);
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productTableMousePressed(evt);
            }
        });
        test1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            productTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            productTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            productTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            productTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            productTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            productTable.getColumnModel().getColumn(7).setPreferredWidth(200);
        }

        javax.swing.GroupLayout ProductsLayerLayout = new javax.swing.GroupLayout(ProductsLayer);
        ProductsLayer.setLayout(ProductsLayerLayout);
        ProductsLayerLayout.setHorizontalGroup(
            ProductsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ProductsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productMeta, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                    .addComponent(test1))
                .addGap(20, 20, 20))
        );
        ProductsLayerLayout.setVerticalGroup(
            ProductsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(productMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(test1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        layerPanel.add(ProductsLayer, "ProductsCard");

        CategoriesLayer.setBackground(new java.awt.Color(18, 23, 28));
        CategoriesLayer.setForeground(new java.awt.Color(255, 255, 255));
        CategoriesLayer.setMinimumSize(new java.awt.Dimension(1000, 650));
        CategoriesLayer.setPreferredSize(new java.awt.Dimension(1000, 650));
        CategoriesLayer.setRequestFocusEnabled(false);

        categoryMeta.setBackground(new java.awt.Color(100, 120, 145));
        categoryMeta.setForeground(new java.awt.Color(255, 255, 255));
        categoryMeta.setPreferredSize(new java.awt.Dimension(960, 160));

        categoryId.setEditable(false);
        categoryId.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        categoryId.setFocusable(false);
        categoryId.setPreferredSize(new java.awt.Dimension(60, 25));
        categoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIdActionPerformed(evt);
            }
        });

        categoryName.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        categoryName.setPreferredSize(new java.awt.Dimension(140, 25));

        categoryAdd.setBackground(new java.awt.Color(0, 112, 242));
        categoryAdd.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        categoryAdd.setForeground(new java.awt.Color(255, 255, 255));
        categoryAdd.setText("Add");
        categoryAdd.setPreferredSize(new java.awt.Dimension(140, 25));
        categoryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAddActionPerformed(evt);
            }
        });

        categoryUpdate.setBackground(new java.awt.Color(0, 112, 242));
        categoryUpdate.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        categoryUpdate.setForeground(new java.awt.Color(255, 255, 255));
        categoryUpdate.setText("Update");
        categoryUpdate.setPreferredSize(new java.awt.Dimension(140, 25));
        categoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryUpdateActionPerformed(evt);
            }
        });

        categoryDelete.setBackground(new java.awt.Color(0, 112, 242));
        categoryDelete.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        categoryDelete.setForeground(new java.awt.Color(255, 255, 255));
        categoryDelete.setText("Delete");
        categoryDelete.setPreferredSize(new java.awt.Dimension(140, 25));
        categoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDeleteActionPerformed(evt);
            }
        });

        categoryClear.setBackground(new java.awt.Color(0, 112, 242));
        categoryClear.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        categoryClear.setForeground(new java.awt.Color(255, 255, 255));
        categoryClear.setText("Clear");
        categoryClear.setPreferredSize(new java.awt.Dimension(140, 25));
        categoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryClearActionPerformed(evt);
            }
        });

        categorySearchField.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        categorySearchField.setText("Search Here");
        categorySearchField.setPreferredSize(new java.awt.Dimension(140, 25));
        categorySearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categorySearchFieldKeyReleased(evt);
            }
        });

        categoryImportBtn.setBackground(new java.awt.Color(0, 112, 242));
        categoryImportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        categoryImportBtn.setForeground(new java.awt.Color(255, 255, 255));
        categoryImportBtn.setText("Import");
        categoryImportBtn.setPreferredSize(new java.awt.Dimension(140, 25));
        categoryImportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryImportBtnActionPerformed(evt);
            }
        });

        categoryExportBtn.setBackground(new java.awt.Color(0, 112, 242));
        categoryExportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        categoryExportBtn.setForeground(new java.awt.Color(255, 255, 255));
        categoryExportBtn.setText("Export");
        categoryExportBtn.setPreferredSize(new java.awt.Dimension(140, 25));
        categoryExportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryExportBtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Id");

        jLabel18.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Name");

        javax.swing.GroupLayout categoryMetaLayout = new javax.swing.GroupLayout(categoryMeta);
        categoryMeta.setLayout(categoryMetaLayout);
        categoryMetaLayout.setHorizontalGroup(
            categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryMetaLayout.createSequentialGroup()
                .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryMetaLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(categoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(categoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(categoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryMetaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryId, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30)
                .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(categoryMetaLayout.createSequentialGroup()
                        .addComponent(categoryImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(categoryExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryMetaLayout.createSequentialGroup()
                        .addComponent(categoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(categorySearchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        categoryMetaLayout.setVerticalGroup(
            categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryMetaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(categoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(categoryMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categorySearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        CategoryScrollPane.setBackground(new java.awt.Color(100, 120, 145));
        CategoryScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        CategoryScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        CategoryScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        CategoryScrollPane.setMinimumSize(new java.awt.Dimension(960, 410));
        CategoryScrollPane.setPreferredSize(new java.awt.Dimension(960, 410));

        categoryTable.setBackground(new java.awt.Color(100, 120, 145));
        categoryTable.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        categoryTable.setForeground(new java.awt.Color(255, 255, 255));
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Category Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoryTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        categoryTable.setMinimumSize(new java.awt.Dimension(960, 410));
        categoryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        categoryTable.setShowGrid(true);
        categoryTable.getTableHeader().setReorderingAllowed(false);
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoryTableMousePressed(evt);
            }
        });
        CategoryScrollPane.setViewportView(categoryTable);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        javax.swing.GroupLayout CategoriesLayerLayout = new javax.swing.GroupLayout(CategoriesLayer);
        CategoriesLayer.setLayout(CategoriesLayerLayout);
        CategoriesLayerLayout.setHorizontalGroup(
            CategoriesLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CategoriesLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CategoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        CategoriesLayerLayout.setVerticalGroup(
            CategoriesLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesLayerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(categoryMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(CategoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        layerPanel.add(CategoriesLayer, "CategoriesCard");

        BrandsLayer.setBackground(new java.awt.Color(18, 23, 28));
        BrandsLayer.setMinimumSize(new java.awt.Dimension(1000, 650));
        BrandsLayer.setPreferredSize(new java.awt.Dimension(1000, 650));
        BrandsLayer.setRequestFocusEnabled(false);

        brandMeta.setBackground(new java.awt.Color(100, 120, 145));
        brandMeta.setForeground(new java.awt.Color(255, 255, 255));
        brandMeta.setMinimumSize(new java.awt.Dimension(960, 160));
        brandMeta.setPreferredSize(new java.awt.Dimension(960, 160));

        brandId.setEditable(false);
        brandId.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        brandId.setFocusable(false);
        brandId.setPreferredSize(new java.awt.Dimension(60, 25));
        brandId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandIdActionPerformed(evt);
            }
        });

        brandName.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        brandName.setPreferredSize(new java.awt.Dimension(140, 25));
        brandName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandNameMouseClicked(evt);
            }
        });

        brandAdd.setBackground(new java.awt.Color(0, 112, 242));
        brandAdd.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        brandAdd.setForeground(new java.awt.Color(255, 255, 255));
        brandAdd.setText("Add");
        brandAdd.setPreferredSize(new java.awt.Dimension(140, 25));
        brandAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandAddActionPerformed(evt);
            }
        });

        brandUpdate.setBackground(new java.awt.Color(0, 112, 242));
        brandUpdate.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        brandUpdate.setForeground(new java.awt.Color(255, 255, 255));
        brandUpdate.setText("Update");
        brandUpdate.setPreferredSize(new java.awt.Dimension(140, 25));
        brandUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandUpdateActionPerformed(evt);
            }
        });

        brandDelete.setBackground(new java.awt.Color(0, 112, 242));
        brandDelete.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        brandDelete.setForeground(new java.awt.Color(255, 255, 255));
        brandDelete.setText("Delete");
        brandDelete.setPreferredSize(new java.awt.Dimension(140, 25));
        brandDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandDeleteActionPerformed(evt);
            }
        });

        brandClear.setBackground(new java.awt.Color(0, 112, 242));
        brandClear.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        brandClear.setForeground(new java.awt.Color(255, 255, 255));
        brandClear.setText("Clear");
        brandClear.setPreferredSize(new java.awt.Dimension(140, 25));
        brandClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandClearActionPerformed(evt);
            }
        });

        brandImportBtn.setBackground(new java.awt.Color(0, 112, 242));
        brandImportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        brandImportBtn.setForeground(new java.awt.Color(255, 255, 255));
        brandImportBtn.setText("Import");
        brandImportBtn.setPreferredSize(new java.awt.Dimension(140, 25));
        brandImportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandImportBtnActionPerformed(evt);
            }
        });

        brandExportBtn.setBackground(new java.awt.Color(0, 112, 242));
        brandExportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        brandExportBtn.setForeground(new java.awt.Color(255, 255, 255));
        brandExportBtn.setText("Export");
        brandExportBtn.setPreferredSize(new java.awt.Dimension(140, 25));
        brandExportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandExportBtnActionPerformed(evt);
            }
        });

        brandSearchField.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        brandSearchField.setText("Search Here");
        brandSearchField.setPreferredSize(new java.awt.Dimension(140, 25));
        brandSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                brandSearchFieldKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Id");

        jLabel22.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name");

        javax.swing.GroupLayout brandMetaLayout = new javax.swing.GroupLayout(brandMeta);
        brandMeta.setLayout(brandMetaLayout);
        brandMetaLayout.setHorizontalGroup(
            brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandMetaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brandId, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(brandMetaLayout.createSequentialGroup()
                        .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(brandMetaLayout.createSequentialGroup()
                                .addComponent(brandAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(brandUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(brandDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(brandMetaLayout.createSequentialGroup()
                                .addComponent(brandClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(brandSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(brandMetaLayout.createSequentialGroup()
                                .addComponent(brandImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(brandExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        brandMetaLayout.setVerticalGroup(
            brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandMetaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(brandMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jScrollPane5.setBackground(new java.awt.Color(100, 120, 145));
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        brandTable.setBackground(new java.awt.Color(100, 120, 145));
        brandTable.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        brandTable.setForeground(new java.awt.Color(255, 255, 255));
        brandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Brandname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        brandTable.setMinimumSize(new java.awt.Dimension(960, 410));
        brandTable.setRequestFocusEnabled(false);
        brandTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        brandTable.setShowGrid(true);
        brandTable.getTableHeader().setReorderingAllowed(false);
        brandTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                brandTableMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(brandTable);
        if (brandTable.getColumnModel().getColumnCount() > 0) {
            brandTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        javax.swing.GroupLayout BrandsLayerLayout = new javax.swing.GroupLayout(BrandsLayer);
        BrandsLayer.setLayout(BrandsLayerLayout);
        BrandsLayerLayout.setHorizontalGroup(
            BrandsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrandsLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BrandsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(21, 21, 21))
        );
        BrandsLayerLayout.setVerticalGroup(
            BrandsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BrandsLayerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(brandMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        layerPanel.add(BrandsLayer, "BrandsCard");

        UsersLayer.setBackground(new java.awt.Color(18, 23, 28));
        UsersLayer.setForeground(new java.awt.Color(255, 255, 255));
        UsersLayer.setMinimumSize(new java.awt.Dimension(1000, 650));
        UsersLayer.setPreferredSize(new java.awt.Dimension(1000, 650));
        UsersLayer.setRequestFocusEnabled(false);

        userMeta.setBackground(new java.awt.Color(100, 120, 145));
        userMeta.setForeground(new java.awt.Color(255, 255, 255));
        userMeta.setMinimumSize(new java.awt.Dimension(960, 160));
        userMeta.setPreferredSize(new java.awt.Dimension(960, 160));

        userFirstname.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userFirstname.setPreferredSize(new java.awt.Dimension(140, 25));

        userLastname.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userLastname.setPreferredSize(new java.awt.Dimension(140, 25));

        userEmail.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userEmail.setPreferredSize(new java.awt.Dimension(140, 25));

        userDelete.setBackground(new java.awt.Color(0, 112, 242));
        userDelete.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        userDelete.setForeground(new java.awt.Color(255, 255, 255));
        userDelete.setText("Delete");
        userDelete.setPreferredSize(new java.awt.Dimension(140, 25));
        userDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeleteActionPerformed(evt);
            }
        });

        userClear.setBackground(new java.awt.Color(0, 112, 242));
        userClear.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        userClear.setForeground(new java.awt.Color(255, 255, 255));
        userClear.setText("Clear");
        userClear.setPreferredSize(new java.awt.Dimension(140, 25));
        userClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userClearActionPerformed(evt);
            }
        });

        userUsername.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userUsername.setFocusable(false);
        userUsername.setPreferredSize(new java.awt.Dimension(140, 25));

        userAdd.setBackground(new java.awt.Color(0, 112, 242));
        userAdd.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        userAdd.setForeground(new java.awt.Color(255, 255, 255));
        userAdd.setText("Add");
        userAdd.setPreferredSize(new java.awt.Dimension(140, 25));
        userAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddActionPerformed(evt);
            }
        });

        userUpdate.setBackground(new java.awt.Color(0, 112, 242));
        userUpdate.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        userUpdate.setForeground(new java.awt.Color(255, 255, 255));
        userUpdate.setText("Update");
        userUpdate.setPreferredSize(new java.awt.Dimension(140, 25));
        userUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateActionPerformed(evt);
            }
        });

        userPassword.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userPassword.setPreferredSize(new java.awt.Dimension(140, 25));

        userImportBtn.setBackground(new java.awt.Color(0, 112, 242));
        userImportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        userImportBtn.setForeground(new java.awt.Color(255, 255, 255));
        userImportBtn.setText("Import");
        userImportBtn.setPreferredSize(new java.awt.Dimension(140, 25));
        userImportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userImportBtnActionPerformed(evt);
            }
        });

        userExportBtn.setBackground(new java.awt.Color(0, 112, 242));
        userExportBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        userExportBtn.setForeground(new java.awt.Color(255, 255, 255));
        userExportBtn.setText("Export");
        userExportBtn.setPreferredSize(new java.awt.Dimension(140, 25));
        userExportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userExportBtnActionPerformed(evt);
            }
        });

        userSearchField.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userSearchField.setText("Search Here");
        userSearchField.setPreferredSize(new java.awt.Dimension(140, 25));
        userSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userSearchFieldKeyReleased(evt);
            }
        });

        userId.setEditable(false);
        userId.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userId.setFocusable(false);
        userId.setPreferredSize(new java.awt.Dimension(60, 25));
        userId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Id");

        jLabel24.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Username");

        jLabel25.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email");

        jLabel26.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Password");

        jLabel28.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Lastname*");

        jLabel29.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Firstname*");

        javax.swing.GroupLayout userMetaLayout = new javax.swing.GroupLayout(userMeta);
        userMeta.setLayout(userMetaLayout);
        userMetaLayout.setHorizontalGroup(
            userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMetaLayout.createSequentialGroup()
                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userMetaLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userMetaLayout.createSequentialGroup()
                                .addComponent(userAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(userUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(userDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(userClear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(userMetaLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(userMetaLayout.createSequentialGroup()
                                        .addComponent(userFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(userLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(userMetaLayout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(userMetaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(174, 174, 174)
                        .addComponent(userImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        userMetaLayout.setVerticalGroup(
            userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMetaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userImportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jScrollPane4.setBackground(new java.awt.Color(100, 120, 145));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(960, 410));

        userTable.setBackground(new java.awt.Color(100, 120, 145));
        userTable.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        userTable.setForeground(new java.awt.Color(255, 255, 255));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Email", "Password", "Firstname", "Lastname", "RegisterAt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        userTable.setShowGrid(true);
        userTable.getTableHeader().setReorderingAllowed(false);
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            userTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            userTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            userTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            userTable.getColumnModel().getColumn(6).setPreferredWidth(180);
        }

        javax.swing.GroupLayout UsersLayerLayout = new javax.swing.GroupLayout(UsersLayer);
        UsersLayer.setLayout(UsersLayerLayout);
        UsersLayerLayout.setHorizontalGroup(
            UsersLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(UsersLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        UsersLayerLayout.setVerticalGroup(
            UsersLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersLayerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(userMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        layerPanel.add(UsersLayer, "UsersCard");

        EditAccountLayer.setBackground(new java.awt.Color(18, 23, 28));
        EditAccountLayer.setForeground(new java.awt.Color(255, 255, 255));
        EditAccountLayer.setMinimumSize(new java.awt.Dimension(1000, 650));
        EditAccountLayer.setPreferredSize(new java.awt.Dimension(1000, 650));
        EditAccountLayer.setRequestFocusEnabled(false);

        accMeta.setBackground(new java.awt.Color(100, 120, 145));
        accMeta.setForeground(new java.awt.Color(255, 255, 255));
        accMeta.setMinimumSize(new java.awt.Dimension(960, 250));
        accMeta.setPreferredSize(new java.awt.Dimension(960, 250));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Personal Info");

        accFirstname.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        accFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accFirstnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Firstname*");

        accLastname.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lastname*");

        updateInfo.setBackground(new java.awt.Color(0, 112, 242));
        updateInfo.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        updateInfo.setForeground(new java.awt.Color(255, 255, 255));
        updateInfo.setText("Save Change");
        updateInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoActionPerformed(evt);
            }
        });

        accEmail.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        javax.swing.GroupLayout accMetaLayout = new javax.swing.GroupLayout(accMeta);
        accMeta.setLayout(accMetaLayout);
        accMetaLayout.setHorizontalGroup(
            accMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accMetaLayout.createSequentialGroup()
                .addGroup(accMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accMetaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(accMetaLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel4))
                    .addGroup(accMetaLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accMetaLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(accLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accMetaLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(accMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateInfo)
                            .addGroup(accMetaLayout.createSequentialGroup()
                                .addComponent(accEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(accFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(330, 330, 330))
        );
        accMetaLayout.setVerticalGroup(
            accMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accMetaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(accMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(accMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(accLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(updateInfo)
                .addContainerGap())
        );

        accPassMeta.setBackground(new java.awt.Color(100, 120, 145));
        accPassMeta.setForeground(new java.awt.Color(255, 255, 255));
        accPassMeta.setMinimumSize(new java.awt.Dimension(960, 170));
        accPassMeta.setPreferredSize(new java.awt.Dimension(960, 170));

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        accOldPass.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N

        accNewPass.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N

        accConfirmNewPassword.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        accConfirmNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accConfirmNewPasswordActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Old Password");

        jLabel12.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("New Password");

        jLabel13.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Confirm Password");

        updatePassword.setBackground(new java.awt.Color(0, 112, 242));
        updatePassword.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        updatePassword.setForeground(new java.awt.Color(255, 255, 255));
        updatePassword.setText("Save Change");
        updatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accPassMetaLayout = new javax.swing.GroupLayout(accPassMeta);
        accPassMeta.setLayout(accPassMetaLayout);
        accPassMetaLayout.setHorizontalGroup(
            accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accPassMetaLayout.createSequentialGroup()
                .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accPassMetaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accPassMetaLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accPassMetaLayout.createSequentialGroup()
                                .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(accPassMetaLayout.createSequentialGroup()
                                .addComponent(updatePassword)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(accPassMetaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(442, 442, 442))
        );
        accPassMetaLayout.setVerticalGroup(
            accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accPassMetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(accOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accPassMetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(updatePassword)
                .addContainerGap())
        );

        javax.swing.GroupLayout EditAccountLayerLayout = new javax.swing.GroupLayout(EditAccountLayer);
        EditAccountLayer.setLayout(EditAccountLayerLayout);
        EditAccountLayerLayout.setHorizontalGroup(
            EditAccountLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditAccountLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(EditAccountLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accPassMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        EditAccountLayerLayout.setVerticalGroup(
            EditAccountLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditAccountLayerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(accMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(accPassMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layerPanel.add(EditAccountLayer, "EditAccountCard");

        mainPanel.add(layerPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void loadDashboard() {
        JFreeChart barChart = DashboardController.createChart();
        chartPanel = new ChartPanel(barChart);

        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 650));
        dbPanel.removeAll();
        dbPanel.setLayout(new BorderLayout());
        dbPanel.add(chartPanel);
        dbPanel.validate();
        dbPanel.repaint();
    }

    private void productUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productUpdateActionPerformed
        if (inputVerifier.verify(productName) && inputVerifier.verify(productQuantity) && inputVerifier.verify(productPrice)) {
            int id = Integer.parseInt(productId.getText());
            String name = productName.getText().trim();
            String category = String.valueOf(productCategory.getSelectedItem());
            String brand = String.valueOf(productBrand.getSelectedItem());
            int quantity = Integer.parseInt(productQuantity.getText());
            int price = Integer.parseInt(productPrice.getText());
            Product product = new Product(id, name, price, quantity, category, brand);
            ProductController.dbUpdateProduct(product);
            productClear();
            new ProductController(productTable);
        }
    }//GEN-LAST:event_productUpdateActionPerformed

    private void categoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryUpdateActionPerformed
        if (inputVerifier.verify(categoryName)) {
            int id = Integer.parseInt(categoryId.getText());
            String name = categoryName.getText().trim();
            Category category = new Category(id, name);
            CategoryController.dbUpdateCategory(category);
            categoryName.setText("");
            categoryId.setText("");
            new CategoryController(categoryTable);
        }

    }//GEN-LAST:event_categoryUpdateActionPerformed

    private void brandUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandUpdateActionPerformed

        if (inputVerifier.verify(brandName)) {
            int id = Integer.parseInt(brandId.getText());
            String name = brandName.getText().trim();
            Brand brand = new Brand(id, name);
            BrandController.dbUpdateBrand(brand);
            brandName.setText("");
            brandId.setText("");
            new BrandController(brandTable);
        }
    }//GEN-LAST:event_brandUpdateActionPerformed

    private void brandAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandAddActionPerformed

        if (inputVerifier.verify(brandName)) {
            String name = brandName.getText().trim();
            Brand brand = new Brand(name);
            BrandController.dbAddBrand(brand);
            brandName.setText("");
            brandId.setText("");
            new BrandController(brandTable);
        }


    }//GEN-LAST:event_brandAddActionPerformed

    private void brandDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandDeleteActionPerformed
        int id = Integer.parseInt(brandId.getText());
        Brand brand = new Brand(id);
        BrandController.dbDeleteBrand(brand);
        brandName.setText("");
        brandId.setText("");
        new BrandController(brandTable);

    }//GEN-LAST:event_brandDeleteActionPerformed

    private void DashboardPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardPanelMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "DashboardCard");
        loadDashboard();
        activatePanel(DashboardPanel);
    }//GEN-LAST:event_DashboardPanelMouseClicked

    private void ProductsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsPanelMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "ProductsCard");
        activatePanel(ProductsPanel);
        ProductController.loadBrandData(productBrand);
        ProductController.loadCategoryData(productCategory);
        new ProductController(productTable);


    }//GEN-LAST:event_ProductsPanelMouseClicked

    private void CategoriesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesPanelMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "CategoriesCard");
        activatePanel(CategoriesPanel);
        new CategoryController(categoryTable);

    }//GEN-LAST:event_CategoriesPanelMouseClicked

    private void EditAccountPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccountPanelMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "EditAccountCard");
        activatePanel(EditAccountPanel);
    }//GEN-LAST:event_EditAccountPanelMouseClicked

    private void BrandsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrandsPanelMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "BrandsCard");
        activatePanel(BrandsPanel);
        new BrandController(brandTable);
    }//GEN-LAST:event_BrandsPanelMouseClicked

    private void UsersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersPanelMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "UsersCard");
        activatePanel(UsersPanel);
        new UserController(userTable);
    }//GEN-LAST:event_UsersPanelMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        this.dispose();
        new LogoutController().logout();


    }//GEN-LAST:event_jLabel2MouseClicked

    private void brandExportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandExportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        int showDialog = fileChooser.showSaveDialog(this);

        if (showDialog == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            BrandController.exportFile(fileToSave.getAbsolutePath() + ".xlsx");
        }

    }//GEN-LAST:event_brandExportBtnActionPerformed

    private void brandImportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandImportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose file to import");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Chon Excel File ");
        if (x == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            BrandController.importFile(file.getAbsolutePath(), brandTable);
        }


    }//GEN-LAST:event_brandImportBtnActionPerformed

    private void brandSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandSearchFieldKeyReleased
        String query = brandSearchField.getText().trim();
        if (query == "") {
            new BrandController(brandTable);
        } else {
            BrandController.search(query, brandTable);
        }
    }//GEN-LAST:event_brandSearchFieldKeyReleased

    private void brandIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandIdActionPerformed

    private void categoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIdActionPerformed

    private void brandNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandNameMouseClicked


    }//GEN-LAST:event_brandNameMouseClicked

    private void brandClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandClearActionPerformed
        brandClear();
    }//GEN-LAST:event_brandClearActionPerformed

    private void brandTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandTableMousePressed
        DefaultTableModel model = (DefaultTableModel) brandTable.getModel();
        int index = brandTable.getSelectedRow();
        brandId.setText(model.getValueAt(index, 0).toString());
        brandName.setText(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_brandTableMousePressed

    private void categoryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryClearActionPerformed
        categoryClear();
    }//GEN-LAST:event_categoryClearActionPerformed

    private void categoryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAddActionPerformed
        if (inputVerifier.verify(categoryName)) {
            String name = categoryName.getText().trim();
            Category category = new Category(name);
            CategoryController.dbAddCategory(category);

            categoryId.setText("");
            categoryName.setText("");
            new CategoryController(categoryTable);
            CategoryScrollPane.revalidate();
        }

    }//GEN-LAST:event_categoryAddActionPerformed

    private void categoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDeleteActionPerformed
        int id = Integer.parseInt(categoryId.getText());
        Category category = new Category(id);
        CategoryController.dbDeleteCategory(category);
        categoryName.setText("");
        categoryId.setText("");
        new CategoryController(categoryTable);


    }//GEN-LAST:event_categoryDeleteActionPerformed

    private void categorySearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorySearchFieldKeyReleased
        String query = categorySearchField.getText().trim();
        if (query == "") {
            new CategoryController(categoryTable);
        } else {
            CategoryController.search(query, categoryTable);
        }
    }//GEN-LAST:event_categorySearchFieldKeyReleased

    private void categoryImportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryImportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose file to import");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Chon Excel File ");
        if (x == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            CategoryController.importFile(file.getAbsolutePath(), categoryTable);
        }
    }//GEN-LAST:event_categoryImportBtnActionPerformed

    private void categoryExportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryExportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        int showDialog = fileChooser.showSaveDialog(this);

        if (showDialog == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            CategoryController.exportFile(fileToSave.getAbsolutePath() + ".xlsx");
        }
    }//GEN-LAST:event_categoryExportBtnActionPerformed

    private void categoryTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMousePressed
        DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
        int index = categoryTable.getSelectedRow();
        categoryId.setText(model.getValueAt(index, 0).toString());
        categoryName.setText(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_categoryTableMousePressed

    private void productAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAddActionPerformed

        if (inputVerifier.verify(productName) && inputVerifier.verify(productQuantity) && inputVerifier.verify(productPrice)) {
            String name = productName.getText().trim();
            String category = String.valueOf(productCategory.getSelectedItem());
            String brand = String.valueOf(productBrand.getSelectedItem());
            int quantity = Integer.parseInt(productQuantity.getText());
            int price = Integer.parseInt(productPrice.getText());
            Product product = new Product(name, price, quantity, category, brand, curUser.getUsername());
            ProductController.dbAddProduct(product);
            productClear();
            new ProductController(productTable);
        }


    }//GEN-LAST:event_productAddActionPerformed

    private void productTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMousePressed
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int index = productTable.getSelectedRow();
        productId.setText(model.getValueAt(index, 0).toString());
        productName.setText(model.getValueAt(index, 1).toString());
        productPrice.setText(model.getValueAt(index, 2).toString());
        productQuantity.setText(model.getValueAt(index, 3).toString());
        productCategory.setSelectedItem(model.getValueAt(index, 4).toString());
        productBrand.setSelectedItem(model.getValueAt(index, 5).toString());


    }//GEN-LAST:event_productTableMousePressed

    private void productDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDeleteActionPerformed
        int id = Integer.parseInt(productId.getText());
        Product product = new Product(id);
        ProductController.dbDeleteProduct(product);
        productClear();
        new ProductController(productTable);
    }//GEN-LAST:event_productDeleteActionPerformed

    private void productClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productClearActionPerformed
        productClear();
    }//GEN-LAST:event_productClearActionPerformed

    private void productExportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productExportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        int showDialog = fileChooser.showSaveDialog(this);

        if (showDialog == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            ProductController.exportFile(fileToSave.getAbsolutePath() + ".xlsx");
        }
    }//GEN-LAST:event_productExportBtnActionPerformed

    private void productSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSearchFieldKeyReleased
        String query = productSearchField.getText().trim();
        if (query == "") {
            new ProductController(productTable);
        } else {
            ProductController.search(query, productTable);
        }
    }//GEN-LAST:event_productSearchFieldKeyReleased

    private void productImportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productImportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose file to import");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Chon Excel File ");
        if (x == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ProductController.importFile(file.getAbsolutePath(), productTable);
        }
    }//GEN-LAST:event_productImportBtnActionPerformed

    private void userTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMousePressed
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int index = userTable.getSelectedRow();
        userId.setText(model.getValueAt(index, 0).toString());
        userUsername.setText(model.getValueAt(index, 1).toString());
        userEmail.setText(model.getValueAt(index, 2).toString());
        userPassword.setText(model.getValueAt(index, 3).toString());

        if (model.getValueAt(index, 4) != null) {
            userFirstname.setText(model.getValueAt(index, 4).toString());
        }

        if (model.getValueAt(index, 5) != null) {
            userLastname.setText(model.getValueAt(index, 5).toString());
        }


    }//GEN-LAST:event_userTableMousePressed

    private void userAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddActionPerformed

        if (inputVerifier.verify(userUsername) && inputVerifier.verify(userEmail) && inputVerifier.verify(userPassword)
                && inputVerifier.verify(userFirstname) && inputVerifier.verify(userLastname)) {
            String username = userUsername.getText().trim();
            String email = userEmail.getText().trim();
            String password = userPassword.getText().trim();
            String firstname = userFirstname.getText().trim();
            String lastname = userLastname.getText().trim();

            User user = new User(username, email, password, firstname, lastname);
            UserController.dbAddUser(user);
            userClear();
            new UserController(userTable);
        }


    }//GEN-LAST:event_userAddActionPerformed

    private void accFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accFirstnameActionPerformed

    private void updatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePasswordActionPerformed
        if (inputVerifier.verify(accOldPass) && inputVerifier.verify(accNewPass)) {
            String oldPass = accOldPass.getText().trim();
            String newPass = accNewPass.getText().trim();
            String confirmPass = accConfirmNewPassword.getText().trim();
            if (!oldPass.equals(curUser.getPassword())) {
                JOptionPane.showMessageDialog(null, "old Password is not correct");
            } else {
                if (!newPass.equals(confirmPass)) {
                    JOptionPane.showMessageDialog(null, "Confirm Password is not correct");
                } else {
                    curUser.setPassword(newPass);
                    UserController.dbUpdateUser(curUser);
                    JOptionPane.showMessageDialog(null, "Update Password Successfully");

                }
            }
        }


    }//GEN-LAST:event_updatePasswordActionPerformed

    private void updateInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoActionPerformed
        if (inputVerifier.verify(accEmail) && inputVerifier.verify(accFirstname)
                && inputVerifier.verify(accLastname)) {
            curUser.setEmail(accEmail.getText().trim());
            curUser.setFirstname(accFirstname.getText().trim());
            curUser.setLastname(accLastname.getText().trim());

            UserDAO.dbUpdateUser(curUser);

        }


    }//GEN-LAST:event_updateInfoActionPerformed

    private void userUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateActionPerformed
        userUsername.setName("username");
        userEmail.setName("email");
        int id = Integer.parseInt(userId.getText());

        if (inputVerifier.verify(userUsername) && inputVerifier.verify(userEmail) && Validation.checkExistence(id, userUsername, userEmail) && inputVerifier.verify(userPassword)
                && inputVerifier.verify(userFirstname) && inputVerifier.verify(userLastname)) {
            String username = userUsername.getText().trim();
            String email = userEmail.getText().trim();
            String password = userPassword.getText().trim();
            String firstname = userFirstname.getText().trim();
            String lastname = userLastname.getText().trim();

            User user = new User(id, username, email, password, firstname, lastname);
            UserController.dbUpdateUser(user);
            userClear();
            new UserController(userTable);

        }

    }//GEN-LAST:event_userUpdateActionPerformed

    private void userDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteActionPerformed
        int id = Integer.parseInt(userId.getText());
        if (id == curUser.getId()) {
            JOptionPane.showMessageDialog(null, "You can't delete yourself", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String username = userUsername.getText().trim();
            User user = new User(id, username);
            UserController.dbDeleteUser(user);
            userClear();
            new UserController(userTable);
        }

    }//GEN-LAST:event_userDeleteActionPerformed

    private void userClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userClearActionPerformed
        userClear();
    }//GEN-LAST:event_userClearActionPerformed

    private void userSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userSearchFieldKeyReleased
        String query = userSearchField.getText().trim();
        if (query == "") {
            new UserController(userTable);
        } else {
            UserController.search(query, userTable);
        }
    }//GEN-LAST:event_userSearchFieldKeyReleased

    private void userExportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userExportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        int showDialog = fileChooser.showSaveDialog(this);

        if (showDialog == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            UserController.exportFile(fileToSave.getAbsolutePath() + ".xlsx");
        }
    }//GEN-LAST:event_userExportBtnActionPerformed

    private void userImportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userImportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose file to import");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Chon Excel File ");
        if (x == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            UserController.importFile(file.getAbsolutePath(), userTable);
        }
    }//GEN-LAST:event_userImportBtnActionPerformed

    private void helloLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helloLableMouseClicked
        CardLayout card = (CardLayout) layerPanel.getLayout();
        card.show(layerPanel, "EditAccountCard");

        activatePanel(EditAccountPanel);
    }//GEN-LAST:event_helloLableMouseClicked

    private void accConfirmNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accConfirmNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accConfirmNewPasswordActionPerformed

    private void userIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdActionPerformed

    // Switch Panel Function
    public void switchLayer(JPanel panel) {

        layerPanel.removeAll();
        layerPanel.add(panel);
        layerPanel.repaint();
        layerPanel.revalidate();
        if (panel == DashboardLayer) {
            loadDashboard();
        }
    }

    // Activate Panel Functions
    public void returnBackground(JPanel panel) {
        panel.setBackground(new Color(48, 66, 106));
    }

    public void activatePanel(JPanel panel) {

        returnBackground(DashboardPanel);
        returnBackground(ProductsPanel);
        returnBackground(BrandsPanel);
        returnBackground(CategoriesPanel);
        returnBackground(UsersPanel);
        returnBackground(EditAccountPanel);
        panel.setBackground(new Color(110, 130, 172));

    }

    public void brandClear() {
        brandName.setText("");
        brandId.setText("");
        brandSearchField.setText("");
    }

    public void categoryClear() {
        categoryId.setText("");
        categoryName.setText("");
        categorySearchField.setText("");
    }

    public void productClear() {
        productId.setText("");
        productName.setText("");
        productPrice.setText("");
        productCategory.setSelectedIndex(0);
        productBrand.setSelectedIndex(0);

        productQuantity.setText("");

    }

    public void userClear() {
        userUsername.setText("");
        userEmail.setText("");
        userPassword.setText("");
        userFirstname.setText("");
        userLastname.setText("");

    }

    private void setValidation() {
        categoryName.setInputVerifier(inputVerifier);
        categoryName.setName("name");

        brandName.setInputVerifier(inputVerifier);
        brandName.setName("name");

        productPrice.setInputVerifier(inputVerifier);
        productPrice.setName("price");
        productQuantity.setInputVerifier(inputVerifier);
        productQuantity.setName("quantity");
        productName.setInputVerifier(inputVerifier);
        productName.setName("name");

        userUsername.setInputVerifier(inputVerifier);
        userUsername.setName("existUsername");
        userEmail.setInputVerifier(inputVerifier);
        userEmail.setName("existEmail");
        userPassword.setInputVerifier(inputVerifier);
        userPassword.setName("password");
        userFirstname.setInputVerifier(inputVerifier);
        userFirstname.setName("name");
        userLastname.setInputVerifier(inputVerifier);
        userLastname.setName("name");

        accEmail.setInputVerifier(inputVerifier);
        accEmail.setName("email");
        accOldPass.setInputVerifier(inputVerifier);
        accOldPass.setName("password");
        accFirstname.setInputVerifier(inputVerifier);
        accFirstname.setName("name");
        accLastname.setInputVerifier(inputVerifier);
        accLastname.setName("name");
        accNewPass.setInputVerifier(inputVerifier);
        accNewPass.setName("password");
     
    }

    private void setRoundComponents() {

        productId.putClientProperty("JComponent.roundRect", true);
        productName.putClientProperty("JComponent.roundRect", true);
        productPrice.putClientProperty("JComponent.roundRect", true);
        productQuantity.putClientProperty("JComponent.roundRect", true);
        productSearchField.putClientProperty("JComponent.roundRect", true);
        productBrand.putClientProperty("JComponent.roundRect", true);
        productCategory.putClientProperty("JComponent.roundRect", true);

        productAdd.putClientProperty("JButton.buttonType", "roundRect");
        productUpdate.putClientProperty("JButton.buttonType", "roundRect");
        productDelete.putClientProperty("JButton.buttonType", "roundRect");
        productImportBtn.putClientProperty("JButton.buttonType", "roundRect");
        productExportBtn.putClientProperty("JButton.buttonType", "roundRect");
        productClear.putClientProperty("JButton.buttonType", "roundRect");

        categoryId.putClientProperty("JComponent.roundRect", true);
        categoryName.putClientProperty("JComponent.roundRect", true);
        categorySearchField.putClientProperty("JComponent.roundRect", true);

        categoryAdd.putClientProperty("JButton.buttonType", "roundRect");
        categoryUpdate.putClientProperty("JButton.buttonType", "roundRect");
        categoryDelete.putClientProperty("JButton.buttonType", "roundRect");
        categoryImportBtn.putClientProperty("JButton.buttonType", "roundRect");
        categoryExportBtn.putClientProperty("JButton.buttonType", "roundRect");
        categoryClear.putClientProperty("JButton.buttonType", "roundRect");

        brandId.putClientProperty("JComponent.roundRect", true);
        brandName.putClientProperty("JComponent.roundRect", true);
        brandSearchField.putClientProperty("JComponent.roundRect", true);

        brandAdd.putClientProperty("JButton.buttonType", "roundRect");
        brandUpdate.putClientProperty("JButton.buttonType", "roundRect");
        brandDelete.putClientProperty("JButton.buttonType", "roundRect");
        brandImportBtn.putClientProperty("JButton.buttonType", "roundRect");
        brandExportBtn.putClientProperty("JButton.buttonType", "roundRect");
        brandClear.putClientProperty("JButton.buttonType", "roundRect");

        userId.putClientProperty("JComponent.roundRect", true);
        userUsername.putClientProperty("JComponent.roundRect", true);
        userEmail.putClientProperty("JComponent.roundRect", true);
        userPassword.putClientProperty("JComponent.roundRect", true);
        userFirstname.putClientProperty("JComponent.roundRect", true);
        userLastname.putClientProperty("JComponent.roundRect", true);

        userSearchField.putClientProperty("JComponent.roundRect", true);

        userAdd.putClientProperty("JButton.buttonType", "roundRect");
        userUpdate.putClientProperty("JButton.buttonType", "roundRect");
        userDelete.putClientProperty("JButton.buttonType", "roundRect");
        userImportBtn.putClientProperty("JButton.buttonType", "roundRect");
        userExportBtn.putClientProperty("JButton.buttonType", "roundRect");
        userClear.putClientProperty("JButton.buttonType", "roundRect");

        accEmail.putClientProperty("JComponent.roundRect", true);
        accFirstname.putClientProperty("JComponent.roundRect", true);
        accLastname.putClientProperty("JComponent.roundRect", true);
        accOldPass.putClientProperty("JComponent.roundRect", true);
        accNewPass.putClientProperty("JComponent.roundRect", true);
        accConfirmNewPassword.putClientProperty("JComponent.roundRect", true);

        updateInfo.putClientProperty("JButton.buttonType", "roundRect");
        updatePassword.putClientProperty("JButton.buttonType", "roundRect");

        productMeta.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
        categoryMeta.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
        brandMeta.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
        userMeta.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
        accMeta.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
        accPassMeta.putClientProperty(FlatClientProperties.STYLE, "arc: 16");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BrandsLayer;
    private javax.swing.JPanel BrandsPanel;
    private javax.swing.JPanel CategoriesLayer;
    private javax.swing.JPanel CategoriesPanel;
    private javax.swing.JScrollPane CategoryScrollPane;
    private javax.swing.JPanel DashboardLayer;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel EditAccountLayer;
    private javax.swing.JPanel EditAccountPanel;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel ProductsLayer;
    private javax.swing.JPanel ProductsPanel;
    private javax.swing.JPanel UsersLayer;
    private javax.swing.JPanel UsersPanel;
    private javax.swing.JTextField accConfirmNewPassword;
    private javax.swing.JTextField accEmail;
    private javax.swing.JTextField accFirstname;
    private javax.swing.JTextField accLastname;
    private javax.swing.JPanel accMeta;
    private javax.swing.JTextField accNewPass;
    private javax.swing.JTextField accOldPass;
    private javax.swing.JPanel accPassMeta;
    private javax.swing.JButton brandAdd;
    private javax.swing.JButton brandClear;
    private javax.swing.JButton brandDelete;
    private javax.swing.JButton brandExportBtn;
    private javax.swing.JTextField brandId;
    private javax.swing.JButton brandImportBtn;
    private javax.swing.JPanel brandMeta;
    private javax.swing.JTextField brandName;
    private javax.swing.JTextField brandSearchField;
    private javax.swing.JTable brandTable;
    private javax.swing.JButton brandUpdate;
    private javax.swing.JLabel brandsText;
    private javax.swing.JLabel categoriesText;
    private javax.swing.JButton categoryAdd;
    private javax.swing.JButton categoryClear;
    private javax.swing.JButton categoryDelete;
    private javax.swing.JButton categoryExportBtn;
    private javax.swing.JTextField categoryId;
    private javax.swing.JButton categoryImportBtn;
    private javax.swing.JPanel categoryMeta;
    private javax.swing.JTextField categoryName;
    private javax.swing.JTextField categorySearchField;
    private javax.swing.JTable categoryTable;
    private javax.swing.JButton categoryUpdate;
    private javax.swing.JPanel dbPanel;
    private javax.swing.JLabel dbText;
    private javax.swing.JLabel editText;
    private javax.swing.JLabel helloLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel layerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton productAdd;
    private javax.swing.JComboBox<String> productBrand;
    private javax.swing.JComboBox<String> productCategory;
    private javax.swing.JButton productClear;
    private javax.swing.JButton productDelete;
    private javax.swing.JButton productExportBtn;
    private javax.swing.JTextField productId;
    private javax.swing.JButton productImportBtn;
    private javax.swing.JPanel productMeta;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JTextField productSearchField;
    private javax.swing.JTable productTable;
    private javax.swing.JButton productUpdate;
    private javax.swing.JLabel productsText;
    private javax.swing.JScrollPane test1;
    private javax.swing.JPanel topBar;
    private javax.swing.JButton updateInfo;
    private javax.swing.JButton updatePassword;
    private javax.swing.JButton userAdd;
    private javax.swing.JButton userClear;
    private javax.swing.JButton userDelete;
    private javax.swing.JTextField userEmail;
    private javax.swing.JButton userExportBtn;
    private javax.swing.JTextField userFirstname;
    private javax.swing.JTextField userId;
    private javax.swing.JButton userImportBtn;
    private javax.swing.JTextField userLastname;
    private javax.swing.JPanel userMeta;
    private javax.swing.JTextField userPassword;
    private javax.swing.JTextField userSearchField;
    private javax.swing.JTable userTable;
    private javax.swing.JButton userUpdate;
    private javax.swing.JTextField userUsername;
    private javax.swing.JLabel usersText;
    // End of variables declaration//GEN-END:variables
}
