/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Desarollador
 */
public class Vista_Compras extends javax.swing.JPanel {

    /**
     * Creates new form Vista_Compras
     */
    public Vista_Compras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        PanelCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblCliente2 = new javax.swing.JLabel();
        PanelCodigo = new javax.swing.JPanel();
        lblCodigoProdcuto = new javax.swing.JLabel();
        txtCodigoProdcuto = new javax.swing.JTextField();
        Sep1 = new javax.swing.JSeparator();
        lblCodigoProdcuto1 = new javax.swing.JLabel();
        txtCodigoProdcuto1 = new javax.swing.JTextField();
        Sep2 = new javax.swing.JSeparator();
        PanelTabla = new javax.swing.JPanel();
        ScrollPanelTabla = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        PanelOpciones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        PanelTotal = new javax.swing.JPanel();
        lblIndicardorTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();
        PanelEmpleado = new javax.swing.JPanel();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblCliente1 = new javax.swing.JLabel();

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        PanelCliente.setBackground(new java.awt.Color(255, 255, 255));
        PanelCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("Metodo de Pago");
        lblCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCliente2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCliente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente2.setText("Proveedor");
        lblCliente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCliente2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelClienteLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblCliente2)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        PanelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        PanelCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblCodigoProdcuto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCodigoProdcuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoProdcuto.setText("Descripción:");
        lblCodigoProdcuto.setIconTextGap(15);

        txtCodigoProdcuto.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtCodigoProdcuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoProdcuto.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        txtCodigoProdcuto.setBorder(null);
        txtCodigoProdcuto.setSelectionColor(new java.awt.Color(0, 0, 0));

        lblCodigoProdcuto1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCodigoProdcuto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoProdcuto1.setText("Cantidad:");
        lblCodigoProdcuto1.setIconTextGap(15);

        txtCodigoProdcuto1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtCodigoProdcuto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoProdcuto1.setText("9999");
        txtCodigoProdcuto1.setBorder(null);
        txtCodigoProdcuto1.setSelectionColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelCodigoLayout = new javax.swing.GroupLayout(PanelCodigo);
        PanelCodigo.setLayout(PanelCodigoLayout);
        PanelCodigoLayout.setHorizontalGroup(
            PanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigoProdcuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoProdcuto, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(Sep2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lblCodigoProdcuto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sep1)
                    .addComponent(txtCodigoProdcuto1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelCodigoLayout.setVerticalGroup(
            PanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCodigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCodigoLayout.createSequentialGroup()
                        .addComponent(txtCodigoProdcuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sep2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCodigoLayout.createSequentialGroup()
                        .addGroup(PanelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoProdcuto)
                            .addComponent(lblCodigoProdcuto1))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCodigoLayout.createSequentialGroup()
                        .addComponent(txtCodigoProdcuto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );

        PanelTabla.setBackground(new java.awt.Color(255, 255, 255));
        PanelTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollPanelTabla.setViewportView(tblCarrito);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelTabla)
                .addContainerGap())
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelTabla)
                .addContainerGap())
        );

        PanelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        PanelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(115, 99, 232));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconBusquedaMini.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setIconTextGap(5);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAñadir.setBackground(new java.awt.Color(255, 255, 255));
        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(57, 127, 213));
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconAñadir.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setBorder(null);
        btnAñadir.setFocusPainted(false);
        btnAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAñadir.setIconTextGap(5);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnQuitar.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnQuitar.setForeground(new java.awt.Color(108, 194, 211));
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconQuitar.png"))); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setBorder(null);
        btnQuitar.setFocusPainted(false);
        btnQuitar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQuitar.setIconTextGap(5);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconEliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setIconTextGap(5);

        btnBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(154, 205, 50));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconAgregar.png"))); // NOI18N
        btnBuscar1.setText("Agregar");
        btnBuscar1.setBorder(null);
        btnBuscar1.setFocusPainted(false);
        btnBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar1.setIconTextGap(5);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        PanelTotal.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblIndicardorTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblIndicardorTotal.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblIndicardorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIndicardorTotal.setText("Total:");

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("$ 123456789");

        btnCobrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCobrar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(246, 181, 81));
        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconVender.png"))); // NOI18N
        btnCobrar.setText("Comprar");
        btnCobrar.setBorder(null);
        btnCobrar.setFocusPainted(false);
        btnCobrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCobrar.setIconTextGap(5);

        javax.swing.GroupLayout PanelTotalLayout = new javax.swing.GroupLayout(PanelTotal);
        PanelTotal.setLayout(PanelTotalLayout);
        PanelTotalLayout.setHorizontalGroup(
            PanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIndicardorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTotalLayout.setVerticalGroup(
            PanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCobrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIndicardorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        PanelEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        PanelEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblNombreEmpleado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblNombreEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEmpleado.setText("a Proveedores");

        lblCliente1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente1.setText("Compra");
        lblCliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCliente1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanelEmpleadoLayout = new javax.swing.GroupLayout(PanelEmpleado);
        PanelEmpleado.setLayout(PanelEmpleadoLayout);
        PanelEmpleadoLayout.setHorizontalGroup(
            PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelEmpleadoLayout.setVerticalGroup(
            PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreEmpleado)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(PanelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(PanelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    public javax.swing.JPanel PanelCliente;
    private javax.swing.JPanel PanelCodigo;
    private javax.swing.JPanel PanelEmpleado;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JPanel PanelTotal;
    private javax.swing.JScrollPane ScrollPanelTabla;
    private javax.swing.JSeparator Sep1;
    private javax.swing.JSeparator Sep2;
    public javax.swing.JButton btnAñadir;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscar1;
    public javax.swing.JButton btnCobrar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCodigoProdcuto;
    private javax.swing.JLabel lblCodigoProdcuto1;
    private javax.swing.JLabel lblIndicardorTotal;
    public javax.swing.JLabel lblNombreEmpleado;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JTable tblCarrito;
    public javax.swing.JTextField txtCodigoProdcuto;
    public javax.swing.JTextField txtCodigoProdcuto1;
    // End of variables declaration//GEN-END:variables
}
