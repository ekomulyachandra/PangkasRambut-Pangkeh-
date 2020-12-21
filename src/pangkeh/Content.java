/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangkeh;

import Struk.PrintJobWatcher;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintServiceLookup;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import javax.print.DocFlavor;
import javax.print.Doc;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author LABSIKOMP05
 */
public class Content extends javax.swing.JFrame {
    private DefaultTableModel model,modelmember,modelsuplier,modeljasa,modelbarang,
            modelpembelian,modelpenjualan,modelhakakses,modelstokbarang;
    Statement st;
    int hrgbrgpembelian,jmlbrgpembelian,hrgbrgpenjualan,jmlbrgpenjualan;
    ResultSet rs;
    PreparedStatement ps;
    String sql;
    String TambahJasa,TambahBarang,IdJasaTambah,IdBarangTambah;
    /**
     * Creates new form Content
     */
    public Content() {
        initComponents();
        Koneksi connection = new Koneksi();
        model= new DefaultTableModel();
        TabelPegawai.setModel(model);
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Telepon");
        model.addColumn("Alamat");
        TampilDataPegawai();
        IdPegawaiOtomatis();
        modelmember= new DefaultTableModel();
        TabelMember.setModel(modelmember);
        modelmember.addColumn("No ");
        modelmember.addColumn("ID Member");
        modelmember.addColumn("Nama Member");
        modelmember.addColumn("Telepon Member");
        modelmember.addColumn("Alamat Member");
        TampilDataMember();
        IdMemberOtomotis();
        modelsuplier=new DefaultTableModel();
        TabelSuplier.setModel(modelsuplier);
        modelsuplier.addColumn("No");
        modelsuplier.addColumn("ID Suplier");
        modelsuplier.addColumn("Nama Suplier");
        modelsuplier.addColumn("Telepon Member");
        modelsuplier.addColumn("Alamat Suplier");
        TampilDataSuplier();
        IdSuplierOtomatis();
        modeljasa= new DefaultTableModel();
        TabelJasa.setModel(modeljasa);
        modeljasa.addColumn("No");
        modeljasa.addColumn("Id Jasa");
        modeljasa.addColumn("Nama Jasa");
        modeljasa.addColumn("Harga Jasa");
        modeljasa.addColumn("Harga Jual");
        modeljasa.addColumn("Fee");
        TampilDataJasa();
        IdJasaOtomatis();
        modelbarang= new DefaultTableModel();
        TabelBarang.setModel(modelbarang);
        modelbarang.addColumn("No");
        modelbarang.addColumn("Id Barang");
        modelbarang.addColumn("Nama Barang");
        modelbarang.addColumn("Harga Bersih");
        modelbarang.addColumn("Harga Jual");
        modelbarang.addColumn("Stok");
        TampilDataBarang();
        IdBarangOtomatis();
        modelpembelian= new DefaultTableModel();
        TabelPembelian.setModel(modelpembelian);
        modelpembelian.addColumn("Nama Barang");
        modelpembelian.addColumn("Banyak");
        modelpembelian.addColumn("Harga");
        IdPembelianOtomatis();
        IdPenjualanOtomatis();
        modelpenjualan= new DefaultTableModel();
        TabelPenjualan.setModel(modelpenjualan);
        modelpenjualan.addColumn("Layanan");
        modelpenjualan.addColumn("Harga");
        modelhakakses = new DefaultTableModel();
        TabelHakUser.setModel(modelhakakses);
        modelhakakses.addColumn("No");
        modelhakakses.addColumn("Username");
        modelhakakses.addColumn("Hak User");
        TampilDataHakAkses();
        modelstokbarang= new DefaultTableModel();
        TabelStokBarang.setModel(modelstokbarang);
        modelstokbarang.addColumn("No");
        modelstokbarang.addColumn("Id Barang");
        modelstokbarang.addColumn("Nama Barang");
        modelstokbarang.addColumn("Stok");
        TampilDataBarangStok();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Top = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtNamaUSerLogin = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        leftPegawai = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        leftHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        leftMember = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        leftTransaksi = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        leftJasaBarang = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        leftSuplier = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        leftLaporan = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        leftHakAkses = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        Isi = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Pegawai = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPegawai = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnSimpanPegawai = new javax.swing.JButton();
        btnUbahPegawai = new javax.swing.JButton();
        btnHapusPegawai = new javax.swing.JButton();
        btnBersihPegawai = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NamaPegawai = new javax.swing.JTextField();
        TeleponPegawai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlamatPegawai = new javax.swing.JTextArea();
        TxtIdPegawai = new javax.swing.JLabel();
        Member = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelMember = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        NamaMember = new javax.swing.JTextField();
        telpMember = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AlamatMember = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtIdMember = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnHapusMember = new javax.swing.JButton();
        btnSimpanMember = new javax.swing.JButton();
        btnUbahMember = new javax.swing.JButton();
        btnBersihMember = new javax.swing.JButton();
        Transaksi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TransaksiPembelian = new javax.swing.JPanel();
        TotalPembelian = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        TxtIdPembelian = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        cbIdSuplier = new javax.swing.JComboBox<>();
        jLabel92 = new javax.swing.JLabel();
        NamaSuplierPembelian = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        cbIdBarangPembelian = new javax.swing.JComboBox<>();
        jLabel98 = new javax.swing.JLabel();
        NamaBarangPembelian = new javax.swing.JTextField();
        JumlahBarangPembelian = new javax.swing.JTextField();
        HargaBarangPembelian = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        CbIdKasir = new javax.swing.JComboBox<>();
        NamaKasirPembelian = new javax.swing.JTextField();
        TanggalPembelian = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabelPembelian = new javax.swing.JTable();
        BayarPembelian = new javax.swing.JButton();
        TambahPembelian = new javax.swing.JButton();
        JasaDanBarang = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Jasa = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelJasa = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        btnSimpanJasa = new javax.swing.JButton();
        btnUbahJasa = new javax.swing.JButton();
        btnHapusJasa = new javax.swing.JButton();
        btnBersihJasa = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        TxtIdJasa = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        NamaJasa = new javax.swing.JTextField();
        HargaBersihJasa = new javax.swing.JTextField();
        HargaJualJasa = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtfee = new javax.swing.JLabel();
        Barang = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelBarang = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        btnSimpanBarang = new javax.swing.JButton();
        btnUbahBarang = new javax.swing.JButton();
        btnHapusBarang = new javax.swing.JButton();
        btnBersihBarang = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        NamaBarang = new javax.swing.JTextField();
        HargaBersihBarang = new javax.swing.JTextField();
        txtIdBarang = new javax.swing.JLabel();
        HargaJualBarang = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        StokBarang = new javax.swing.JTextField();
        TransaksiPenjualan = new javax.swing.JPanel();
        TotalBayarPenjualan = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        TxtIdPenjualan = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        cbIdJasa = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        NamaJasaPenjualan = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        NamaPemotongPenjualan = new javax.swing.JTextField();
        HargaJasaPenjualan = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        cbIdPemotong = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        cbIdBarangPenjualan = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        NamaBarangPenjualan = new javax.swing.JTextField();
        JumlahBarangPenjualan = new javax.swing.JTextField();
        HargaBarangPenjualan = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        TambahJasaPenjualan = new javax.swing.JButton();
        TambahBarangPenjualan = new javax.swing.JButton();
        TanggalPenjualan = new com.toedter.calendar.JDateChooser();
        jLabel57 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        NamaMemberPenjualan = new javax.swing.JTextField();
        cbIdMemberPenjualan = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        TabelPenjualan = new javax.swing.JTable();
        btnBayarPenjualan = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        TabelStokBarang = new javax.swing.JTable();
        btnHapusPenjualan = new javax.swing.JButton();
        Suplier = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TabelSuplier = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        NamaSuplier = new javax.swing.JTextField();
        telpSuplier = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        AlamatSuplier = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TxtIdSuplier = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btnHapusSuplier = new javax.swing.JButton();
        btnSimpanSuplier = new javax.swing.JButton();
        btnUbahSuplier = new javax.swing.JButton();
        btnBersihSuplier = new javax.swing.JButton();
        Laporan = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        HakAkses = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TabelHakUser = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        btnSimpanHakAkses = new javax.swing.JButton();
        btnHapusHakAkses = new javax.swing.JButton();
        btnBersihHakAkses = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cmbUser = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        LaporanPembelian = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LaporanPembelian1 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        BulanLpBulanan = new com.toedter.calendar.JMonthChooser();
        TahunLpBulanan = new com.toedter.calendar.JYearChooser();
        LaporanPembelian2 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        TanggalLpHarian = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        LaporanPembelian3 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        TahunLpTahunan = new com.toedter.calendar.JYearChooser();
        LaporanPenjualan = new javax.swing.JPanel();
        btnLaporanTahunanPenjualan = new javax.swing.JButton();
        btnLaporanHarianPenjualan = new javax.swing.JButton();
        btnLaporanBulananPenjualan = new javax.swing.JButton();
        LaporanPenjualan1 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        BulanLpBulanan1 = new com.toedter.calendar.JMonthChooser();
        TahunLpBulanan1 = new com.toedter.calendar.JYearChooser();
        LaporanPenjualan2 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        TanggalLpHarian1 = new com.toedter.calendar.JDateChooser();
        jButton11 = new javax.swing.JButton();
        LaporanPenjualan3 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        TahunLpTahunan1 = new com.toedter.calendar.JYearChooser();
        LaporanUpahPegawai = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        LaporanUpahPegawai1 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        BulanLpBulanan2 = new com.toedter.calendar.JMonthChooser();
        TahunLpBulanan2 = new com.toedter.calendar.JYearChooser();
        LaporanUpahPegawai2 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        TanggalLpHarian2 = new com.toedter.calendar.JDateChooser();
        jButton14 = new javax.swing.JButton();
        LaporanUpahPegawai3 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        TahunLpTahunan2 = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Top.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PANGKEH");

        jLabel52.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Logout");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("|");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        txtNamaUSerLogin.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        txtNamaUSerLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaUSerLogin.setText("------");
        txtNamaUSerLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNamaUSerLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 917, Short.MAX_VALUE)
                .addComponent(txtNamaUSerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtNamaUSerLogin)
                    .addComponent(jLabel54)))
        );

        getContentPane().add(Top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        Left.setBackground(new java.awt.Color(102, 102, 102));

        leftPegawai.setBackground(new java.awt.Color(204, 204, 204));
        leftPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftPegawaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftPegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leftPegawaiMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("PEGAWAI");

        javax.swing.GroupLayout leftPegawaiLayout = new javax.swing.GroupLayout(leftPegawai);
        leftPegawai.setLayout(leftPegawaiLayout);
        leftPegawaiLayout.setHorizontalGroup(
            leftPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPegawaiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(40, 40, 40))
        );
        leftPegawaiLayout.setVerticalGroup(
            leftPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPegawaiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        leftHome.setBackground(new java.awt.Color(204, 204, 204));
        leftHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                leftHomeMouseMoved(evt);
            }
        });
        leftHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leftHomeMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("HOME");

        javax.swing.GroupLayout leftHomeLayout = new javax.swing.GroupLayout(leftHome);
        leftHome.setLayout(leftHomeLayout);
        leftHomeLayout.setHorizontalGroup(
            leftHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(52, 52, 52))
        );
        leftHomeLayout.setVerticalGroup(
            leftHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        leftMember.setBackground(new java.awt.Color(204, 204, 204));
        leftMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMemberMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("MEMBER");

        javax.swing.GroupLayout leftMemberLayout = new javax.swing.GroupLayout(leftMember);
        leftMember.setLayout(leftMemberLayout);
        leftMemberLayout.setHorizontalGroup(
            leftMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftMemberLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftMemberLayout.setVerticalGroup(
            leftMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftMemberLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        leftTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        leftTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftTransaksiMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("TRANSAKSI");

        javax.swing.GroupLayout leftTransaksiLayout = new javax.swing.GroupLayout(leftTransaksi);
        leftTransaksi.setLayout(leftTransaksiLayout);
        leftTransaksiLayout.setHorizontalGroup(
            leftTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftTransaksiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftTransaksiLayout.setVerticalGroup(
            leftTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftTransaksiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        leftJasaBarang.setBackground(new java.awt.Color(204, 204, 204));
        leftJasaBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftJasaBarangMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setText("JASA/BARANG");

        javax.swing.GroupLayout leftJasaBarangLayout = new javax.swing.GroupLayout(leftJasaBarang);
        leftJasaBarang.setLayout(leftJasaBarangLayout);
        leftJasaBarangLayout.setHorizontalGroup(
            leftJasaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJasaBarangLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(22, 22, 22))
        );
        leftJasaBarangLayout.setVerticalGroup(
            leftJasaBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJasaBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        leftSuplier.setBackground(new java.awt.Color(204, 204, 204));
        leftSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftSuplierMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setText("SUPLIER");

        javax.swing.GroupLayout leftSuplierLayout = new javax.swing.GroupLayout(leftSuplier);
        leftSuplier.setLayout(leftSuplierLayout);
        leftSuplierLayout.setHorizontalGroup(
            leftSuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSuplierLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel29)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        leftSuplierLayout.setVerticalGroup(
            leftSuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSuplierLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel29)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        leftLaporan.setBackground(new java.awt.Color(204, 204, 204));
        leftLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftLaporanMouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setText("LAPORAN");

        javax.swing.GroupLayout leftLaporanLayout = new javax.swing.GroupLayout(leftLaporan);
        leftLaporan.setLayout(leftLaporanLayout);
        leftLaporanLayout.setHorizontalGroup(
            leftLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLaporanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel30)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        leftLaporanLayout.setVerticalGroup(
            leftLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLaporanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel30)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        leftHakAkses.setBackground(new java.awt.Color(204, 204, 204));
        leftHakAkses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftHakAksesMouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel31.setText("HAK AKSES");

        javax.swing.GroupLayout leftHakAksesLayout = new javax.swing.GroupLayout(leftHakAkses);
        leftHakAkses.setLayout(leftHakAksesLayout);
        leftHakAksesLayout.setHorizontalGroup(
            leftHakAksesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftHakAksesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftHakAksesLayout.setVerticalGroup(
            leftHakAksesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftHakAksesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel31)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftSuplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftJasaBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPegawai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftHakAkses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(leftHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftJasaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 700));

        Isi.setBackground(new java.awt.Color(255, 255, 255));
        Isi.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/451290_barber-wallpaper.jpg"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        Isi.add(Home, "card3");

        Pegawai.setBackground(new java.awt.Color(51, 51, 51));
        Pegawai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pegawai.setForeground(new java.awt.Color(0, 51, 51));
        Pegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA PEGAWAI");
        Pegawai.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        TabelPegawai.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPegawaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelPegawai);

        Pegawai.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 570, 280));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnSimpanPegawai.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnSimpanPegawai.setText("SIMPAN");
        btnSimpanPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPegawaiActionPerformed(evt);
            }
        });

        btnUbahPegawai.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnUbahPegawai.setText("UBAH");
        btnUbahPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPegawaiActionPerformed(evt);
            }
        });

        btnHapusPegawai.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnHapusPegawai.setText("HAPUS");
        btnHapusPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPegawaiActionPerformed(evt);
            }
        });

        btnBersihPegawai.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBersihPegawai.setText("BERSIH");
        btnBersihPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihPegawaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanPegawai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnUbahPegawai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapusPegawai)
                .addGap(18, 18, 18)
                .addComponent(btnBersihPegawai)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanPegawai)
                    .addComponent(btnUbahPegawai)
                    .addComponent(btnHapusPegawai)
                    .addComponent(btnBersihPegawai))
                .addContainerGap())
        );

        Pegawai.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 380, 50));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama ");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No Telepon");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alamat");

        AlamatPegawai.setColumns(20);
        AlamatPegawai.setRows(5);
        jScrollPane1.setViewportView(AlamatPegawai);

        TxtIdPegawai.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        TxtIdPegawai.setForeground(new java.awt.Color(255, 255, 255));
        TxtIdPegawai.setText("----");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(TeleponPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtIdPegawai))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(NamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TeleponPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Pegawai.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 370, 280));

        Isi.add(Pegawai, "card2");

        Member.setBackground(new java.awt.Color(51, 51, 51));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DATA MEMBER");

        TabelMember.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMemberMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabelMember);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Alamat");

        AlamatMember.setColumns(20);
        AlamatMember.setRows(5);
        jScrollPane3.setViewportView(AlamatMember);

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID Member");

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nama ");

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("No Telp");

        TxtIdMember.setBackground(new java.awt.Color(255, 255, 255));
        TxtIdMember.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        TxtIdMember.setForeground(new java.awt.Color(255, 255, 255));
        TxtIdMember.setText("------");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telpMember, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtIdMember, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TxtIdMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(telpMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnHapusMember.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnHapusMember.setText("Hapus");
        btnHapusMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMemberActionPerformed(evt);
            }
        });

        btnSimpanMember.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnSimpanMember.setText("Simpan");
        btnSimpanMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanMemberActionPerformed(evt);
            }
        });

        btnUbahMember.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnUbahMember.setText("Ubah");
        btnUbahMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahMemberActionPerformed(evt);
            }
        });

        btnBersihMember.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBersihMember.setText("Bersih");
        btnBersihMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanMember)
                .addGap(18, 18, 18)
                .addComponent(btnUbahMember)
                .addGap(18, 18, 18)
                .addComponent(btnHapusMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBersihMember)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapusMember)
                    .addComponent(btnUbahMember)
                    .addComponent(btnSimpanMember)
                    .addComponent(btnBersihMember))
                .addContainerGap())
        );

        javax.swing.GroupLayout MemberLayout = new javax.swing.GroupLayout(Member);
        Member.setLayout(MemberLayout);
        MemberLayout.setHorizontalGroup(
            MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MemberLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MemberLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel14)
                    .addContainerGap(939, Short.MAX_VALUE)))
        );
        MemberLayout.setVerticalGroup(
            MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MemberLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel14)
                    .addContainerGap(616, Short.MAX_VALUE)))
        );

        Isi.add(Member, "card3");

        Transaksi.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel19.setText("PENJUALAN");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/img_507205.png"))); // NOI18N
        jLabel22.setText("jLabel22");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/images (1).png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel23.setText("PEMBELIAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(101, 101, 101))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TransaksiLayout = new javax.swing.GroupLayout(Transaksi);
        Transaksi.setLayout(TransaksiLayout);
        TransaksiLayout.setHorizontalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        TransaksiLayout.setVerticalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        Isi.add(Transaksi, "card3");

        TransaksiPembelian.setBackground(new java.awt.Color(51, 51, 51));
        TransaksiPembelian.setForeground(new java.awt.Color(255, 255, 255));

        TotalPembelian.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        TotalPembelian.setForeground(new java.awt.Color(255, 255, 255));
        TotalPembelian.setText("0");

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Total Bayar");

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaksi Pembelian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));

        jLabel88.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("No Nota");

        TxtIdPembelian.setForeground(new java.awt.Color(255, 255, 255));
        TxtIdPembelian.setText("------");

        jLabel90.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Tanggal");

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel91.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("ID Suplier");

        cbIdSuplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdSuplierItemStateChanged(evt);
            }
        });
        cbIdSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbIdSuplierMouseClicked(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Nama Suplier");

        NamaSuplierPembelian.setEditable(false);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel97.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("ID Barang");

        cbIdBarangPembelian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbIdBarangPembelian.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdBarangPembelianItemStateChanged(evt);
            }
        });
        cbIdBarangPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbIdBarangPembelianMouseClicked(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Nama Barang");

        NamaBarangPembelian.setEditable(false);

        JumlahBarangPembelian.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                JumlahBarangPembelianCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JumlahBarangPembelianInputMethodTextChanged(evt);
            }
        });
        JumlahBarangPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBarangPembelianActionPerformed(evt);
            }
        });
        JumlahBarangPembelian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JumlahBarangPembelianKeyPressed(evt);
            }
        });

        HargaBarangPembelian.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        HargaBarangPembelian.setForeground(new java.awt.Color(255, 255, 255));
        HargaBarangPembelian.setText("0");

        jLabel100.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Harga");

        jLabel101.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Jumlah");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(jLabel97))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbIdBarangPembelian, 0, 162, Short.MAX_VALUE)
                            .addComponent(NamaBarangPembelian)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jLabel100))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JumlahBarangPembelian)
                            .addComponent(HargaBarangPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdBarangPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98))
                .addGap(14, 14, 14)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(NamaBarangPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahBarangPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(HargaBarangPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbIdSuplier, 0, 165, Short.MAX_VALUE)
                    .addComponent(NamaSuplierPembelian))
                .addContainerGap())
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addGap(14, 14, 14)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(NamaSuplierPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel93.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("ID Kasir");

        jLabel94.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Nama Kasir");

        CbIdKasir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbIdKasirItemStateChanged(evt);
            }
        });
        CbIdKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbIdKasirMouseClicked(evt);
            }
        });

        NamaKasirPembelian.setEditable(false);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel90)
                            .addComponent(jLabel93)
                            .addComponent(jLabel94))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIdPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbIdKasir, 0, 148, Short.MAX_VALUE)
                            .addComponent(NamaKasirPembelian)
                            .addComponent(TanggalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(TxtIdPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90)
                    .addComponent(TanggalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(CbIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(NamaKasirPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );

        TabelPembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(TabelPembelian);

        BayarPembelian.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        BayarPembelian.setText("BAYAR");
        BayarPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarPembelianActionPerformed(evt);
            }
        });

        TambahPembelian.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        TambahPembelian.setText("TAMBAH");
        TambahPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahPembelianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransaksiPembelianLayout = new javax.swing.GroupLayout(TransaksiPembelian);
        TransaksiPembelian.setLayout(TransaksiPembelianLayout);
        TransaksiPembelianLayout.setHorizontalGroup(
            TransaksiPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TransaksiPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TransaksiPembelianLayout.createSequentialGroup()
                        .addComponent(BayarPembelian)
                        .addGap(231, 231, 231)
                        .addComponent(jLabel32)
                        .addGap(29, 29, 29)
                        .addComponent(TotalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(TransaksiPembelianLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(TambahPembelian))
        );
        TransaksiPembelianLayout.setVerticalGroup(
            TransaksiPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPembelianLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(TransaksiPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransaksiPembelianLayout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TambahPembelian))
                    .addGroup(TransaksiPembelianLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TransaksiPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BayarPembelian)
                            .addComponent(jLabel32)
                            .addComponent(TotalPembelian))))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        Isi.add(TransaksiPembelian, "card3");

        JasaDanBarang.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel33.setText("JASA");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/images (2).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(64, 64, 64))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pomade_2027748.jpg"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel36.setText("BARANG");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(122, 122, 122))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JasaDanBarangLayout = new javax.swing.GroupLayout(JasaDanBarang);
        JasaDanBarang.setLayout(JasaDanBarangLayout);
        JasaDanBarangLayout.setHorizontalGroup(
            JasaDanBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JasaDanBarangLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        JasaDanBarangLayout.setVerticalGroup(
            JasaDanBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JasaDanBarangLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(JasaDanBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        Isi.add(JasaDanBarang, "card3");

        Jasa.setBackground(new java.awt.Color(51, 51, 51));
        Jasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jasa.setForeground(new java.awt.Color(0, 51, 51));
        Jasa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("DATA JASA");
        Jasa.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jScrollPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane6MouseClicked(evt);
            }
        });

        TabelJasa.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelJasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelJasaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TabelJasa);

        Jasa.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 570, 260));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnSimpanJasa.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnSimpanJasa.setText("SIMPAN");
        btnSimpanJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanJasaActionPerformed(evt);
            }
        });

        btnUbahJasa.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnUbahJasa.setText("UBAH");
        btnUbahJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahJasaActionPerformed(evt);
            }
        });

        btnHapusJasa.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnHapusJasa.setText("HAPUS");
        btnHapusJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusJasaActionPerformed(evt);
            }
        });

        btnBersihJasa.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBersihJasa.setText("BERSIH");
        btnBersihJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihJasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanJasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnUbahJasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapusJasa)
                .addGap(10, 10, 10)
                .addComponent(btnBersihJasa)
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanJasa)
                    .addComponent(btnUbahJasa)
                    .addComponent(btnHapusJasa)
                    .addComponent(btnBersihJasa))
                .addContainerGap())
        );

        Jasa.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 380, 50));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        TxtIdJasa.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        TxtIdJasa.setForeground(new java.awt.Color(255, 255, 255));
        TxtIdJasa.setText("----");

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("ID");

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Nama Jasa ");

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Harga Bersih");

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Harga Jual");

        HargaJualJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaJualJasaActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Fee");

        txtfee.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        txtfee.setForeground(new java.awt.Color(255, 255, 255));
        txtfee.setText("-----");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HargaBersihJasa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaJasa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdJasa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HargaJualJasa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(TxtIdJasa))
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(NamaJasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(HargaBersihJasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(HargaJualJasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtfee))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Jasa.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 370, 260));

        Isi.add(Jasa, "card2");

        Barang.setBackground(new java.awt.Color(51, 51, 51));
        Barang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Barang.setForeground(new java.awt.Color(0, 51, 51));
        Barang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("DATA BARANG");
        Barang.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        TabelBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelBarangMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(TabelBarang);

        Barang.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 570, 280));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnSimpanBarang.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnSimpanBarang.setText("SIMPAN");
        btnSimpanBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanBarangMouseClicked(evt);
            }
        });
        btnSimpanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanBarangActionPerformed(evt);
            }
        });

        btnUbahBarang.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnUbahBarang.setText("UBAH");
        btnUbahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahBarangMouseClicked(evt);
            }
        });
        btnUbahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahBarangActionPerformed(evt);
            }
        });

        btnHapusBarang.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnHapusBarang.setText("HAPUS");
        btnHapusBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusBarangMouseClicked(evt);
            }
        });
        btnHapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusBarangActionPerformed(evt);
            }
        });

        btnBersihBarang.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBersihBarang.setText("BERSIH");
        btnBersihBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnUbahBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapusBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBersihBarang)
                .addGap(18, 18, 18))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanBarang)
                    .addComponent(btnUbahBarang)
                    .addComponent(btnHapusBarang)
                    .addComponent(btnBersihBarang))
                .addContainerGap())
        );

        Barang.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 370, 50));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("ID");

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Nama Barang");

        jLabel50.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Harga Bersih");

        jLabel51.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Stok");

        txtIdBarang.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        txtIdBarang.setForeground(new java.awt.Color(255, 255, 255));
        txtIdBarang.setText("--");

        jLabel73.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Harga Jual");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel48))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(142, 142, 142)
                        .addComponent(StokBarang))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel73))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HargaBersihBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(HargaJualBarang))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtIdBarang))
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(HargaBersihBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HargaJualBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(StokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Barang.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 370, 230));

        Isi.add(Barang, "card2");

        TransaksiPenjualan.setBackground(new java.awt.Color(51, 51, 51));
        TransaksiPenjualan.setForeground(new java.awt.Color(255, 255, 255));

        TotalBayarPenjualan.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        TotalBayarPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        TotalBayarPenjualan.setText("------");

        jLabel55.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Total Bayar");

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaksi Penjualan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("#");

        TxtIdPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        TxtIdPenjualan.setText("------");

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Tanggal");

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jasa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel59.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("ID Jasa");

        cbIdJasa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdJasaItemStateChanged(evt);
            }
        });
        cbIdJasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbIdJasaMouseClicked(evt);
            }
        });
        cbIdJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdJasaActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Nama Jasa");

        NamaJasaPenjualan.setEditable(false);

        jLabel61.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Nama Pemotong");

        NamaPemotongPenjualan.setEditable(false);

        HargaJasaPenjualan.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        HargaJasaPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        HargaJasaPenjualan.setText("---");

        jLabel63.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("ID Pemotong");

        jLabel64.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Harga");

        cbIdPemotong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdPemotongItemStateChanged(evt);
            }
        });
        cbIdPemotong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbIdPemotongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59)
                    .addComponent(jLabel64)
                    .addComponent(jLabel61)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NamaPemotongPenjualan)
                    .addComponent(cbIdJasa, 0, 160, Short.MAX_VALUE)
                    .addComponent(NamaJasaPenjualan)
                    .addComponent(cbIdPemotong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HargaJasaPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdJasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGap(14, 14, 14)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(NamaJasaPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(cbIdPemotong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaPemotongPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HargaJasaPenjualan)
                    .addComponent(jLabel64)))
        );

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel65.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("ID Barang");

        cbIdBarangPenjualan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdBarangPenjualanItemStateChanged(evt);
            }
        });
        cbIdBarangPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbIdBarangPenjualanMouseClicked(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Nama Barang");

        NamaBarangPenjualan.setEditable(false);

        JumlahBarangPenjualan.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                JumlahBarangPenjualanCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JumlahBarangPenjualanInputMethodTextChanged(evt);
            }
        });
        JumlahBarangPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBarangPenjualanActionPerformed(evt);
            }
        });

        HargaBarangPenjualan.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        HargaBarangPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        HargaBarangPenjualan.setText("---");

        jLabel70.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Harga");

        jLabel67.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Jumlah");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbIdBarangPenjualan, 0, 155, Short.MAX_VALUE)
                            .addComponent(NamaBarangPenjualan)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel70))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JumlahBarangPenjualan)
                            .addComponent(HargaBarangPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdBarangPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(14, 14, 14)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(NamaBarangPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahBarangPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(HargaBarangPenjualan))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        TambahJasaPenjualan.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        TambahJasaPenjualan.setText("TAMBAH");
        TambahJasaPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahJasaPenjualanActionPerformed(evt);
            }
        });

        TambahBarangPenjualan.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        TambahBarangPenjualan.setText("TAMBAH");
        TambahBarangPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahBarangPenjualanActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("No Nota");

        jLabel62.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Nama Member");

        jLabel68.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("ID Member");

        NamaMemberPenjualan.setEditable(false);

        cbIdMemberPenjualan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Nama Member" }));
        cbIdMemberPenjualan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdMemberPenjualanItemStateChanged(evt);
            }
        });
        cbIdMemberPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbIdMemberPenjualanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TambahBarangPenjualan))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(42, 42, 42)
                                .addComponent(NamaMemberPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TambahJasaPenjualan))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(cbIdMemberPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtIdPenjualan))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(TanggalPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56)
                    .addComponent(TxtIdPenjualan))
                .addGap(9, 9, 9)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TanggalPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(cbIdMemberPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(NamaMemberPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(TambahJasaPenjualan)
                        .addGap(158, 158, 158)
                        .addComponent(TambahBarangPenjualan)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        TabelPenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(TabelPenjualan);

        btnBayarPenjualan.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBayarPenjualan.setText("BAYAR");
        btnBayarPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarPenjualanActionPerformed(evt);
            }
        });

        TabelStokBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(TabelStokBarang);

        btnHapusPenjualan.setText("HAPUS");
        btnHapusPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransaksiPenjualanLayout = new javax.swing.GroupLayout(TransaksiPenjualan);
        TransaksiPenjualan.setLayout(TransaksiPenjualanLayout);
        TransaksiPenjualanLayout.setHorizontalGroup(
            TransaksiPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPenjualanLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TransaksiPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransaksiPenjualanLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransaksiPenjualanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBayarPenjualan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusPenjualan)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel55)
                        .addGap(54, 54, 54)
                        .addComponent(TotalBayarPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransaksiPenjualanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        TransaksiPenjualanLayout.setVerticalGroup(
            TransaksiPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPenjualanLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TransaksiPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TransaksiPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(TotalBayarPenjualan))
                    .addComponent(btnBayarPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapusPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TransaksiPenjualanLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 170, Short.MAX_VALUE))
        );

        Isi.add(TransaksiPenjualan, "card3");

        Suplier.setBackground(new java.awt.Color(51, 51, 51));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("DATA SUPLIER");

        TabelSuplier.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelSuplierMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TabelSuplier);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Alamat");

        AlamatSuplier.setColumns(20);
        AlamatSuplier.setRows(5);
        jScrollPane10.setViewportView(AlamatSuplier);

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ID Suplier");

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Nama ");

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("No Telp");

        TxtIdSuplier.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        TxtIdSuplier.setForeground(new java.awt.Color(255, 255, 255));
        TxtIdSuplier.setText("----");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel25))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NamaSuplier, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(telpSuplier)
                            .addComponent(TxtIdSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TxtIdSuplier))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(NamaSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(telpSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnHapusSuplier.setBackground(new java.awt.Color(255, 255, 255));
        btnHapusSuplier.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnHapusSuplier.setText("Hapus");
        btnHapusSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSuplierActionPerformed(evt);
            }
        });

        btnSimpanSuplier.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnSimpanSuplier.setText("Simpan");
        btnSimpanSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanSuplierMouseClicked(evt);
            }
        });
        btnSimpanSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanSuplierActionPerformed(evt);
            }
        });

        btnUbahSuplier.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnUbahSuplier.setText("Ubah");
        btnUbahSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahSuplierActionPerformed(evt);
            }
        });

        btnBersihSuplier.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBersihSuplier.setText("Bersih");
        btnBersihSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihSuplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanSuplier)
                .addGap(18, 18, 18)
                .addComponent(btnUbahSuplier)
                .addGap(18, 18, 18)
                .addComponent(btnHapusSuplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBersihSuplier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapusSuplier)
                    .addComponent(btnUbahSuplier)
                    .addComponent(btnSimpanSuplier)
                    .addComponent(btnBersihSuplier))
                .addContainerGap())
        );

        javax.swing.GroupLayout SuplierLayout = new javax.swing.GroupLayout(Suplier);
        Suplier.setLayout(SuplierLayout);
        SuplierLayout.setHorizontalGroup(
            SuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuplierLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(SuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SuplierLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(SuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuplierLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel21)
                    .addContainerGap(953, Short.MAX_VALUE)))
        );
        SuplierLayout.setVerticalGroup(
            SuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuplierLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(SuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(SuplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuplierLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel21)
                    .addContainerGap(616, Short.MAX_VALUE)))
        );

        Isi.add(Suplier, "card3");

        Laporan.setBackground(new java.awt.Color(51, 51, 51));
        Laporan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Laporan.setForeground(new java.awt.Color(0, 51, 51));
        Laporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel72.setText("LAPORAN PEMBELIAN");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel72)
                .addGap(59, 59, 59))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel72)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Laporan.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, 80));

        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel69.setText("LAPORAN PENJUALAN");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(45, 45, 45))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(28, 28, 28))
        );

        Laporan.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 270, 80));

        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel71.setText("LAPORAN UPAH PEGAWAI");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel71)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel71)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Laporan.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 270, 80));

        Isi.add(Laporan, "card2");

        HakAkses.setBackground(new java.awt.Color(51, 51, 51));
        HakAkses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HakAkses.setForeground(new java.awt.Color(0, 51, 51));
        HakAkses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("DATA HAK AKSES");
        HakAkses.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        TabelHakUser.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelHakUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelHakUserMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(TabelHakUser);

        HakAkses.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 570, 280));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnSimpanHakAkses.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnSimpanHakAkses.setText("SIMPAN");
        btnSimpanHakAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanHakAksesActionPerformed(evt);
            }
        });

        btnHapusHakAkses.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnHapusHakAkses.setText("HAPUS");
        btnHapusHakAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusHakAksesActionPerformed(evt);
            }
        });

        btnBersihHakAkses.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        btnBersihHakAkses.setText("BERSIH");
        btnBersihHakAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihHakAksesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanHakAkses)
                .addGap(57, 57, 57)
                .addComponent(btnHapusHakAkses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnBersihHakAkses)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanHakAkses)
                    .addComponent(btnHapusHakAkses)
                    .addComponent(btnBersihHakAkses))
                .addContainerGap())
        );

        HakAkses.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 380, 50));

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Username");

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Password");

        cmbUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "Pegawai", "Owner" }));

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Hak Akses");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(cmbUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cmbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel53)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        HakAkses.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 370, 280));

        Isi.add(HakAkses, "card2");

        LaporanPembelian.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPembelian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPembelian.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPembelian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("LAPORAN TAHUNAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        LaporanPembelian.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 390, 60));

        jButton2.setText("LAPORAN HARIAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        LaporanPembelian.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 390, 60));

        jButton3.setText("LAPORAN BULANAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        LaporanPembelian.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 390, 60));

        Isi.add(LaporanPembelian, "card2");

        LaporanPembelian1.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPembelian1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPembelian1.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPembelian1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setText("CETAK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(181, 181, 181))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(BulanLpBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TahunLpBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BulanLpBulanan, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(TahunLpBulanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        LaporanPembelian1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanPembelian1, "card2");

        LaporanPembelian2.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPembelian2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPembelian2.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPembelian2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setText("CETAK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(TanggalLpHarian, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton5)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(TanggalLpHarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton5)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        LaporanPembelian2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanPembelian2, "card2");

        LaporanPembelian3.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPembelian3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPembelian3.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPembelian3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(204, 204, 204));

        jButton6.setText("CETAK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButton6)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TahunLpTahunan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TahunLpTahunan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton6)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        LaporanPembelian3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanPembelian3, "card2");

        LaporanPenjualan.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPenjualan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPenjualan.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPenjualan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLaporanTahunanPenjualan.setText("LAPORAN TAHUNAN");
        btnLaporanTahunanPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanTahunanPenjualanActionPerformed(evt);
            }
        });
        LaporanPenjualan.add(btnLaporanTahunanPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 390, 60));

        btnLaporanHarianPenjualan.setText("LAPORAN HARIAN");
        btnLaporanHarianPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanHarianPenjualanActionPerformed(evt);
            }
        });
        LaporanPenjualan.add(btnLaporanHarianPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 390, 60));

        btnLaporanBulananPenjualan.setText("LAPORAN BULANAN");
        btnLaporanBulananPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanBulananPenjualanActionPerformed(evt);
            }
        });
        LaporanPenjualan.add(btnLaporanBulananPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 390, 60));

        Isi.add(LaporanPenjualan, "card2");

        LaporanPenjualan1.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPenjualan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPenjualan1.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPenjualan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(204, 204, 204));

        jButton10.setText("CETAK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(181, 181, 181))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(BulanLpBulanan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TahunLpBulanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BulanLpBulanan1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(TahunLpBulanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jButton10)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        LaporanPenjualan1.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanPenjualan1, "card2");

        LaporanPenjualan2.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPenjualan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPenjualan2.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPenjualan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(204, 204, 204));

        jButton11.setText("CETAK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(TanggalLpHarian1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton11)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(TanggalLpHarian1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton11)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        LaporanPenjualan2.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanPenjualan2, "card2");

        LaporanPenjualan3.setBackground(new java.awt.Color(51, 51, 51));
        LaporanPenjualan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanPenjualan3.setForeground(new java.awt.Color(0, 51, 51));
        LaporanPenjualan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(204, 204, 204));

        jButton12.setText("CETAK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButton12)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TahunLpTahunan1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TahunLpTahunan1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton12)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        LaporanPenjualan3.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanPenjualan3, "card2");

        LaporanUpahPegawai.setBackground(new java.awt.Color(51, 51, 51));
        LaporanUpahPegawai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanUpahPegawai.setForeground(new java.awt.Color(0, 51, 51));
        LaporanUpahPegawai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("LAPORAN TAHUNAN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        LaporanUpahPegawai.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 390, 60));

        jButton8.setText("LAPORAN HARIAN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        LaporanUpahPegawai.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 390, 60));

        jButton9.setText("LAPORAN BULANAN");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        LaporanUpahPegawai.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 390, 60));

        Isi.add(LaporanUpahPegawai, "card2");

        LaporanUpahPegawai1.setBackground(new java.awt.Color(51, 51, 51));
        LaporanUpahPegawai1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanUpahPegawai1.setForeground(new java.awt.Color(0, 51, 51));
        LaporanUpahPegawai1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(204, 204, 204));

        jButton13.setText("CETAK");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(181, 181, 181))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(BulanLpBulanan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TahunLpBulanan2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BulanLpBulanan2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(TahunLpBulanan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jButton13)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        LaporanUpahPegawai1.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanUpahPegawai1, "card2");

        LaporanUpahPegawai2.setBackground(new java.awt.Color(51, 51, 51));
        LaporanUpahPegawai2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanUpahPegawai2.setForeground(new java.awt.Color(0, 51, 51));
        LaporanUpahPegawai2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(204, 204, 204));

        jButton14.setText("CETAK");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(TanggalLpHarian2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton14)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(TanggalLpHarian2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton14)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        LaporanUpahPegawai2.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanUpahPegawai2, "card2");

        LaporanUpahPegawai3.setBackground(new java.awt.Color(51, 51, 51));
        LaporanUpahPegawai3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LaporanUpahPegawai3.setForeground(new java.awt.Color(0, 51, 51));
        LaporanUpahPegawai3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(204, 204, 204));

        jButton15.setText("CETAK");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButton15)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TahunLpTahunan2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TahunLpTahunan2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton15)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        LaporanUpahPegawai3.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 440, 320));

        Isi.add(LaporanUpahPegawai3, "card2");

        getContentPane().add(Isi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 1230, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPegawaiActionPerformed
   
        try {
            // TODO add your handling code here:
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql="Insert into pegawai values('"+TxtIdPegawai.getText()+"','"+NamaPegawai.getText()+"','"+TeleponPegawai.getText()+"','"+AlamatPegawai.getText()+"');";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            TampilDataPegawai();
            BersihPegawai();
            IdPegawaiOtomatis();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanPegawaiActionPerformed

    private void btnHapusPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPegawaiActionPerformed
        // TODO add your handling code here:
        int x= TabelPegawai.getSelectedRow();
        Object y = TabelPegawai.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Delete from pegawai where id_pegawai='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataPegawai();
        BersihPegawai();
    }//GEN-LAST:event_btnHapusPegawaiActionPerformed

    private void btnUbahPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPegawaiActionPerformed
        // TODO add your handling code here:
        int x= TabelPegawai.getSelectedRow();
        Object y = TabelPegawai.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Update pegawai SET nama_pegawai='"+NamaPegawai.getText()+"',telp_pegawai='"+TeleponPegawai.getText()+"',alamat_pegawai='"+AlamatPegawai.getText()+"'where id_pegawai='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataPegawai();
        BersihPegawai();
        IdPegawaiOtomatis();
        
    }//GEN-LAST:event_btnUbahPegawaiActionPerformed

    private void TabelPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPegawaiMouseClicked
        // TODO add your handling code here:
        int x;
        x=TabelPegawai.getSelectedRow();
        Object y = TabelPegawai.getValueAt(x, 1);
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from pegawai where id_pegawai ='"+String.valueOf(y)+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                TxtIdPegawai.setText(rs.getString("id_pegawai"));
                NamaPegawai.setText(rs.getString("nama_pegawai"));
                TeleponPegawai.setText(rs.getString("telp_pegawai"));
                AlamatPegawai.setText(rs.getString("alamat_pegawai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelPegawaiMouseClicked

    private void btnBersihPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihPegawaiActionPerformed
        // TODO add your handling code here:
        BersihPegawai();
    }//GEN-LAST:event_btnBersihPegawaiActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(TransaksiPenjualan);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(TransaksiPembelian);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Jasa);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Barang);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void btnSimpanMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanMemberActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql="Insert into member values('"+TxtIdMember.getText()+"','"+NamaMember.getText()+"',"
                    + "'"+telpMember.getText()+"','"+AlamatMember.getText()+"');";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            TampilDataMember();
            BersihMember();
            IdMemberOtomotis();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSimpanMemberActionPerformed

    private void btnHapusMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMemberActionPerformed
        // TODO add your handling code here:
        int x= TabelMember.getSelectedRow();
        Object y = TabelMember.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Delete from member where id_member='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        IdMemberOtomotis();
        TampilDataMember();
        BersihMember();
    }//GEN-LAST:event_btnHapusMemberActionPerformed

    private void TabelMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMemberMouseClicked
        // TODO add your handling code here:
        int x;
        x=TabelMember.getSelectedRow();
        Object y = TabelMember.getValueAt(x, 1);
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from member where id_member ='"+String.valueOf(y)+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                TxtIdMember.setText(rs.getString("id_member"));
                NamaMember.setText(rs.getString("nama_member"));
                telpMember.setText(rs.getString("telp_member"));
                AlamatMember.setText(rs.getString("alamat_member"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelMemberMouseClicked

    private void btnUbahMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahMemberActionPerformed
        // TODO add your handling code here:
        int x= TabelMember.getSelectedRow();
        Object y = TabelMember.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Update member SET nama_member='"+NamaMember.getText()+"',telp_member='"+telpMember.getText()+"',alamat_member='"+AlamatMember.getText()+"'where id_member='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataMember();
        BersihMember();
        IdMemberOtomotis();
    }//GEN-LAST:event_btnUbahMemberActionPerformed

    private void btnBersihMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihMemberActionPerformed
        // TODO add your handling code here:
        BersihMember();
    }//GEN-LAST:event_btnBersihMemberActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void TabelJasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelJasaMouseClicked
        // TODO add your handling code here:
       int x;
        x=TabelJasa.getSelectedRow();
        Object y = TabelJasa.getValueAt(x, 1);
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from jasa where id_jasa ='"+String.valueOf(y)+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                TxtIdJasa.setText(rs.getString("id_jasa"));
                NamaJasa.setText(rs.getString("nama_jasa"));
                HargaBersihJasa.setText(String.valueOf(rs.getInt("harga_bersih")));
                HargaJualJasa.setText(String.valueOf(rs.getInt("harga_jual")));
                txtfee.setText(String.valueOf(rs.getInt("fee")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelJasaMouseClicked

    private void btnSimpanJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanJasaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql="Insert into jasa values('"+TxtIdJasa.getText()+"','"+NamaJasa.getText()+"',"+HargaBersihJasa.getText()+","+HargaJualJasa.getText()+","+txtfee.getText()+")";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            TampilDataJasa();
            BersihJasa();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        IdJasaOtomatis();
    }//GEN-LAST:event_btnSimpanJasaActionPerformed

    private void btnUbahJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahJasaActionPerformed
        // TODO add your handling code here:
        int x= TabelJasa.getSelectedRow();
        Object y = TabelJasa.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "update jasa set id_jasa=?,nama_jasa=?,harga_bersih=?,harga_jual=?,fee=? where id_jasa='"+String.valueOf(y)+"'";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,TxtIdJasa.getText());
            st.setString(2, NamaJasa.getText());
            st.setString(3, HargaBersihJasa.getText());
            st.setString(4,HargaJualJasa.getText());
            st.setString(5, txtfee.getText());
            st.executeUpdate();
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil DiUbah");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataJasa();
        BersihJasa();
        IdJasaOtomatis();
    }//GEN-LAST:event_btnUbahJasaActionPerformed

    private void btnHapusJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusJasaActionPerformed
        // TODO add your handling code here:
        int x= TabelJasa.getSelectedRow();
        Object y = TabelJasa.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Delete from jasa where id_jasa='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataJasa();
        BersihJasa();
        IdJasaOtomatis();
    }//GEN-LAST:event_btnHapusJasaActionPerformed

    private void btnBersihJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihJasaActionPerformed
        // TODO add your handling code here:
        BersihJasa();
    }//GEN-LAST:event_btnBersihJasaActionPerformed

    private void TabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelBarangMouseClicked
        // TODO add your handling code here:
        int x;
        x=TabelBarang.getSelectedRow();
        Object y = TabelBarang.getValueAt(x, 1);
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from barang where id_barang ='"+String.valueOf(y)+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                txtIdBarang.setText(rs.getString("id_barang"));
                NamaBarang.setText(rs.getString("nama_barang"));
                HargaBersihBarang.setText(String.valueOf(rs.getInt("harga_bersih")));
                HargaJualBarang.setText(String.valueOf(rs.getInt("harga_jual")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelBarangMouseClicked

    private void btnSimpanBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanBarangActionPerformed

    private void btnUbahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahBarangActionPerformed

    private void btnHapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusBarangActionPerformed

    private void btnBersihBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBersihBarangActionPerformed

    private void JumlahBarangPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBarangPembelianActionPerformed
        // TODO add your handling code here:
         jmlbrgpembelian=Integer.parseInt(JumlahBarangPembelian.getText());
        int total=jmlbrgpembelian*hrgbrgpembelian;
        HargaBarangPembelian.setText(String.valueOf(total));
    }//GEN-LAST:event_JumlahBarangPembelianActionPerformed

    private void JumlahBarangPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBarangPenjualanActionPerformed
        // TODO add your handling code here:
        jmlbrgpenjualan=Integer.parseInt(JumlahBarangPenjualan.getText());
        int total=jmlbrgpenjualan*hrgbrgpenjualan;
        HargaBarangPenjualan.setText(String.valueOf(total));
    }//GEN-LAST:event_JumlahBarangPenjualanActionPerformed

    private void TabelSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelSuplierMouseClicked
        // TODO add your handling code here:
        int x;
        x=TabelSuplier.getSelectedRow();
        Object y = TabelSuplier.getValueAt(x, 1);
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from suplier where id_suplier ='"+String.valueOf(y)+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                TxtIdSuplier.setText(rs.getString("id_suplier"));
                NamaSuplier.setText(rs.getString("nama_suplier"));
                telpSuplier.setText(rs.getString("telp_suplier"));
                AlamatSuplier.setText(rs.getString("alamat_suplier"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelSuplierMouseClicked

    private void btnHapusSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSuplierActionPerformed
        // TODO add your handling code here:
        int x= TabelSuplier.getSelectedRow();
        Object y = TabelSuplier.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "delete from suplier where id_suplier='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataSuplier();
        BersihSuplier();
        IdSuplierOtomatis();
    }//GEN-LAST:event_btnHapusSuplierActionPerformed

    private void btnSimpanSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanSuplierActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql="Insert into suplier values('"+TxtIdSuplier.getText()+"','"+NamaSuplier.getText()+"',"
                    + "'"+telpSuplier.getText()+"','"+AlamatSuplier.getText()+"');";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            TampilDataSuplier();
            BersihSuplier();
            IdSuplierOtomatis();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanSuplierActionPerformed

    private void btnUbahSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahSuplierActionPerformed
        // TODO add your handling code here:
        int x= TabelSuplier.getSelectedRow();
        Object y = TabelSuplier.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Update suplier SET nama_suplier='"+NamaSuplier.getText()+"',telp_suplier='"+telpSuplier.getText()+"',alamat_suplier"
                    + "='"+AlamatSuplier.getText()+"'where id_suplier='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataSuplier();
        BersihSuplier();
        IdSuplierOtomatis();
    }//GEN-LAST:event_btnUbahSuplierActionPerformed

    private void btnBersihSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihSuplierActionPerformed
        // TODO add your handling code here:
        BersihSuplier();
    }//GEN-LAST:event_btnBersihSuplierActionPerformed

    private void HargaJualJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaJualJasaActionPerformed
        // TODO add your handling code here:
        double a = Integer.parseInt(HargaBersihJasa.getText());
        double b = Integer.parseInt(HargaJualJasa.getText());
        double c = b-a;
        txtfee.setText(String.valueOf(c));
        
    }//GEN-LAST:event_HargaJualJasaActionPerformed

    private void jScrollPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane6MouseClicked

    private void btnSimpanBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanBarangMouseClicked
        // TODO add your handling code here:
        int st=Integer.parseInt(StokBarang.getText());
        try {
            // TODO add your handling code here:
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql="Insert into barang values('"+txtIdBarang.getText()+"','"+NamaBarang.getText()+"',"+HargaBersihBarang.getText()+","+HargaJualBarang.getText()+","+st+")";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            TampilDataBarang();
            BersihBarang();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        IdBarangOtomatis();
    }//GEN-LAST:event_btnSimpanBarangMouseClicked

    private void btnHapusBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusBarangMouseClicked
        // TODO add your handling code here:
        int x= TabelBarang.getSelectedRow();
        Object y = TabelBarang.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Delete from barang where id_barang='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataBarang();
        BersihBarang();
        IdBarangOtomatis();
    }//GEN-LAST:event_btnHapusBarangMouseClicked

    private void btnUbahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahBarangMouseClicked
        // TODO add your handling code here:
        int x= TabelBarang.getSelectedRow();
        Object y = TabelBarang.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "update barang set id_barang=?,nama_barang=?,harga_bersih=?,harga_jual=?,stok=? where id_barang='"+String.valueOf(y)+"'";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,txtIdBarang.getText());
            st.setString(2, NamaBarang.getText());
            st.setString(3, HargaBersihBarang.getText());
            st.setString(4,HargaJualBarang.getText());
            st.setString(5,StokBarang.getText());
            st.executeUpdate();
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil DiUbah");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataBarang();
        BersihBarang();
        IdBarangOtomatis();
    }//GEN-LAST:event_btnUbahBarangMouseClicked

    private void cbIdSuplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdSuplierItemStateChanged
        // TODO add your handling code here:
         Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from suplier where nama_suplier ='"+String.valueOf(cbIdSuplier.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaSuplierPembelian.setText(rs.getString("id_suplier"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdSuplierItemStateChanged

    private void cbIdBarangPembelianItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdBarangPembelianItemStateChanged
        // TODO add your handling code here:
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from barang where nama_barang ='"+String.valueOf(cbIdBarangPembelian.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaBarangPembelian.setText(rs.getString("id_barang"));
                hrgbrgpembelian=rs.getInt("harga_jual");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdBarangPembelianItemStateChanged

    private void JumlahBarangPembelianInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JumlahBarangPembelianInputMethodTextChanged
        // TODO add your handling code here:
        jmlbrgpembelian=Integer.parseInt(JumlahBarangPembelian.getText());
        int total=jmlbrgpembelian*hrgbrgpembelian;
        HargaBarangPembelian.setText(String.valueOf(total));
        
    }//GEN-LAST:event_JumlahBarangPembelianInputMethodTextChanged

    private void JumlahBarangPembelianCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JumlahBarangPembelianCaretPositionChanged
        // TODO add your handling code here:
        jmlbrgpembelian=Integer.parseInt(JumlahBarangPembelian.getText());
        int total=jmlbrgpembelian*hrgbrgpembelian;
        HargaBarangPembelian.setText(String.valueOf(total));
      
    }//GEN-LAST:event_JumlahBarangPembelianCaretPositionChanged

    private void btnSimpanSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanSuplierMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanSuplierMouseClicked

    private void TambahPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahPembelianActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalPembelian.getDate()));
         try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "insert into pembelian values(?,?,?,?,?); ";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,TxtIdPembelian.getText());
            st.setString(2, tp);
            st.setString(3,NamaKasirPembelian.getText());
            st.setString(4,NamaSuplierPembelian.getText());
            st.setInt(5,Integer.parseInt(TotalPembelian.getText()));
            st.executeUpdate();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "insert into detail_pembelian values(?,?,?,?); ";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,TxtIdPembelian.getText());
            st.setString(2, NamaBarangPembelian.getText());
            st.setInt(3, Integer.parseInt(JumlahBarangPembelian.getText()));
            st.setInt(4,Integer.parseInt(HargaBarangPembelian.getText()));
            st.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[]tbl = new Object[3];
        tbl[0]=cbIdBarangPembelian.getSelectedItem().toString();
        tbl[1]=JumlahBarangPembelian.getText();
        tbl[2]=HargaBarangPembelian.getText();
        modelpembelian.addRow(tbl);
        int baris=modelpembelian.getRowCount();
        int jum=0;
        String a;
        for(int i=0;i<baris;i++){
            a=(String) modelpembelian.getValueAt(i, 2);
            jum=jum+Integer.parseInt(a);
            TotalPembelian.setText(String.valueOf(jum));
        }
        UpdateStok("tambah");
        NamaBarangPembelian.setText("");
        HargaBarangPembelian.setText("");
        JumlahBarangPembelian.setText("");
}
private void TampilDataBarang(){
    modelbarang.getDataVector().removeAllElements();
    modelbarang.fireTableDataChanged();
    try {
            Statement statement = (Statement)Koneksi.getConnection().createStatement();
            String sql ="Select *from  barang";
            ResultSet rs = statement.executeQuery(sql);
            Object []obj= new Object[6];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("id_barang");
                obj[2]=rs.getString("nama_barang");
                obj[3]=rs.getInt("harga_bersih");
                obj[4]=rs.getInt("harga_jual");
                obj[5]=rs.getInt("stok");
                x++;
                modelbarang.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_TambahPembelianActionPerformed

    private void TambahBarangPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahBarangPenjualanActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalPenjualan.getDate()));
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "insert into detail_barang values(?,?,?,?,?); ";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,TxtIdPenjualan.getText());
            st.setString(2,tp);
            st.setString(3,NamaBarangPenjualan.getText() );
            st.setInt(4, Integer.parseInt(JumlahBarangPenjualan.getText()));
            st.setInt(5, Integer.parseInt(HargaBarangPenjualan.getText()));
            st.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[]tbl = new Object[2];
        tbl[0]=cbIdBarangPenjualan.getSelectedItem().toString();
        tbl[1]=HargaBarangPenjualan.getText();
        TambahBarang=cbIdBarangPenjualan.getSelectedItem().toString();
        IdBarangTambah =NamaBarangPenjualan.getText();
        modelpenjualan.addRow(tbl);
        int baris=modelpenjualan.getRowCount();
        int jum=0;
        String a;
        for(int i=0;i<baris;i++){
            a=(String) modelpenjualan.getValueAt(i, 1);
            jum=jum+Integer.parseInt(a);
            TotalBayarPenjualan.setText(String.valueOf(jum));
        }
        UpdateStok("kurang");
        TampilDataBarangStok();
        NamaBarangPenjualan.setText("");
        JumlahBarangPenjualan.setText("");
        HargaBarangPenjualan.setText("");
    }//GEN-LAST:event_TambahBarangPenjualanActionPerformed

    private void JumlahBarangPembelianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JumlahBarangPembelianKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahBarangPembelianKeyPressed

    private void BayarPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarPembelianActionPerformed
        // TODO add your handling code here:
        simpantabelpembelian();
        IdPembelianOtomatis();
        cleantablepembelian();
        TotalPembelian.setText("0");
        TampilDataBarang();
        TampilDataBarangStok();
        

    }//GEN-LAST:event_BayarPembelianActionPerformed

    private void TambahJasaPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahJasaPenjualanActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalPenjualan.getDate()));
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "insert into detail_jasa values(?,?,?,?,?); ";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,TxtIdPenjualan.getText());
            st.setString(2,tp);
            st.setString(3, NamaPemotongPenjualan.getText());
            st.setString(4, NamaJasaPenjualan.getText());
            st.setInt(5, Integer.parseInt(HargaJasaPenjualan.getText()));
            st.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[]tbl = new Object[2];
        tbl[0]=cbIdJasa.getSelectedItem().toString();
        tbl[1]=HargaJasaPenjualan.getText();
        TambahJasa=cbIdJasa.getSelectedItem().toString();
        IdJasaTambah=NamaJasaPenjualan.getText();
        modelpenjualan.addRow(tbl);
        int baris=modelpenjualan.getRowCount();
        int jum=0;
        String a;
        for(int i=0;i<baris;i++){
            a=(String) modelpenjualan.getValueAt(i, 1);
            jum=jum+Integer.parseInt(a);
            TotalBayarPenjualan.setText(String.valueOf(jum));
        }
        NamaJasaPenjualan.setText("");
        NamaPemotongPenjualan.setText("");
        HargaJasaPenjualan.setText("");
    }//GEN-LAST:event_TambahJasaPenjualanActionPerformed

    private void btnBayarPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarPenjualanActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalPenjualan.getDate()));
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "insert into penjualan values(?,?,?,?); ";
            PreparedStatement st =Koneksi.getConnection().prepareStatement(sql);
            st.setString(1,TxtIdPenjualan.getText());
            st.setString(2,tp);
            st.setString(3, NamaMemberPenjualan.getText());
            st.setInt(4, Integer.parseInt(TotalBayarPenjualan.getText()));
            st.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        IdPenjualanOtomatis();
        cleantablepenjualan();
        TotalBayarPenjualan.setText("");
        TampilDataBarangStok();
    }//GEN-LAST:event_btnBayarPenjualanActionPerformed

    private void cbIdJasaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdJasaItemStateChanged
        // TODO add your handling code here:
        Statement statement;
        try {
            int b = 0;
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from jasa where nama_jasa ='"+String.valueOf(cbIdJasa.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaJasaPenjualan.setText(rs.getString("id_jasa"));
                b=Integer.parseInt(rs.getString("harga_jual"));
            }
            int hargaa;
            if(NamaMemberPenjualan.getText().equals("Guest")){
                hargaa=(int) (b+5000);
                HargaJasaPenjualan.setText(String.valueOf(hargaa));
            }else{
                HargaJasaPenjualan.setText(String.valueOf(b));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdJasaItemStateChanged

    private void cbIdPemotongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdPemotongItemStateChanged
        // TODO add your handling code here:
           Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from pegawai where nama_pegawai ='"+String.valueOf(cbIdPemotong.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaPemotongPenjualan.setText(rs.getString("id_pegawai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdPemotongItemStateChanged

    private void cbIdBarangPenjualanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdBarangPenjualanItemStateChanged
        // TODO add your handling code here:
           Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from barang where nama_barang ='"+String.valueOf(cbIdBarangPenjualan.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaBarangPenjualan.setText(rs.getString("id_barang"));
                hrgbrgpenjualan=rs.getInt("harga_jual");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdBarangPenjualanItemStateChanged

    private void JumlahBarangPenjualanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JumlahBarangPenjualanInputMethodTextChanged
        // TODO add your handling code here:
        jmlbrgpenjualan=Integer.parseInt(JumlahBarangPenjualan.getText());
        int total=jmlbrgpenjualan*hrgbrgpenjualan;
        HargaBarangPenjualan.setText(String.valueOf(total));
    }//GEN-LAST:event_JumlahBarangPenjualanInputMethodTextChanged

    private void JumlahBarangPenjualanCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JumlahBarangPenjualanCaretPositionChanged
        // TODO add your handling code here:
        jmlbrgpenjualan=Integer.parseInt(JumlahBarangPenjualan.getText());
        int total=jmlbrgpenjualan*hrgbrgpenjualan;
        HargaBarangPenjualan.setText(String.valueOf(total));
    }//GEN-LAST:event_JumlahBarangPenjualanCaretPositionChanged

    private void cbIdJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdJasaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbIdJasaActionPerformed

    private void cbIdMemberPenjualanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdMemberPenjualanItemStateChanged
        // TODO add your handling code here:
        try {
            Statement statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from member where nama_member ='"+String.valueOf(cbIdMemberPenjualan.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaMemberPenjualan.setText(rs.getString("id_member"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdMemberPenjualanItemStateChanged

    private void leftPegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPegawaiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_leftPegawaiMouseExited

    private void leftPegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPegawaiMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_leftPegawaiMouseEntered

    private void leftPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPegawaiMouseClicked
          // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Pegawai);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftPegawaiMouseClicked

    private void leftHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftHomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_leftHomeMouseExited

    private void leftHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftHomeMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_leftHomeMouseEntered

    private void leftHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftHomeMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Home);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftHomeMouseClicked

    private void leftHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftHomeMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_leftHomeMouseMoved

    private void leftMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMemberMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Member);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftMemberMouseClicked

    private void leftTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftTransaksiMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Transaksi);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftTransaksiMouseClicked

    private void leftJasaBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftJasaBarangMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(JasaDanBarang);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftJasaBarangMouseClicked

    private void leftSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftSuplierMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Suplier);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftSuplierMouseClicked

    private void leftLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftLaporanMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(Laporan);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftLaporanMouseClicked

    private void leftHakAksesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftHakAksesMouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(HakAkses);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_leftHakAksesMouseClicked

    private void TabelHakUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelHakUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelHakUserMouseClicked

    private void btnSimpanHakAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanHakAksesActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql="Insert into hakakses values('"+txtUserName.getText()+"','"+txtPassword.getText()+"','"+cmbUser.getSelectedItem().toString()+"')";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
            TampilDataHakAkses();
            BersihHakAkses();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanHakAksesActionPerformed

    private void btnHapusHakAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusHakAksesActionPerformed
        // TODO add your handling code here:
        int x= TabelPegawai.getSelectedRow();
        Object y = TabelPegawai.getValueAt(x, 1);
        try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "Delete from hakakses where username='"+String.valueOf(y)+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        TampilDataHakAkses();
        BersihHakAkses();
    }//GEN-LAST:event_btnHapusHakAksesActionPerformed

    private void btnBersihHakAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihHakAksesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBersihHakAksesActionPerformed

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseClicked

    private void txtNamaUSerLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNamaUSerLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaUSerLoginMouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        // TODO add your handling code here:
         Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanUpahPegawai);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        // TODO add your handling code here:
       Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPenjualan);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPembelian);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPembelian3);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPembelian1);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalLpHarian.getDate()));
        Map param = new HashMap();
        File file = new File("src/Report/LpHarian.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("ptanggal", tp);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPembelian2);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int tahun = TahunLpTahunan.getYear();
        String a= String.valueOf(tahun);
        Map param = new HashMap();
        File file = new File("src/Report/LpTahunan.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("ptahun",a);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int bulan = BulanLpBulanan.getMonth()+1;
        int tahun = TahunLpBulanan.getYear();
        String a= String.valueOf(bulan);
        String b =String.valueOf(tahun);
        
        Map param = new HashMap();
        
        File file = new File("src/Report/LpBulan.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("pbulan",a);
            param.put("ptahun", b);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLaporanTahunanPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanTahunanPenjualanActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPenjualan3);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_btnLaporanTahunanPenjualanActionPerformed

    private void btnLaporanHarianPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanHarianPenjualanActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPenjualan2);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_btnLaporanHarianPenjualanActionPerformed

    private void btnLaporanBulananPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanBulananPenjualanActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanPenjualan1);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_btnLaporanBulananPenjualanActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int bulan = BulanLpBulanan1.getMonth()+1;
        int tahun = TahunLpBulanan1.getYear();
        
        String a= String.valueOf(bulan);
        String b =String.valueOf(tahun);
        
        Map param = new HashMap();
        File file = new File("src/Report/LJBulan.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("pbulan",a);
            param.put("ptahun", b);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalLpHarian1.getDate()));
        Map param = new HashMap();
        File file = new File("src/Report/LJHarian.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("ptanggal", tp);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int tahun = TahunLpTahunan1.getYear();
        String a= String.valueOf(tahun);
        Map param = new HashMap();
        File file = new File("src/Report/LJTahun.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("ptahun",a);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanUpahPegawai3);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanUpahPegawai2);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Isi.removeAll();
        Isi.repaint();
        Isi.revalidate();
        Isi.add(LaporanUpahPegawai1);
        Isi.repaint();
        Isi.revalidate();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int bulan = BulanLpBulanan2.getMonth()+1;
        int tahun = TahunLpBulanan2.getYear();
        String a= String.valueOf(bulan);
        String b =String.valueOf(tahun);
        
        Map param = new HashMap();
        
        File file = new File("src/Report/UPBulan.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("pbulan",a);
            param.put("ptahun", b);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tp =String.valueOf(df.format(TanggalLpHarian2.getDate()));
        Map param = new HashMap();
        File file = new File("src/Report/UPHari.jrxml");
        try {
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            param.put("ptanggal", tp);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int tahun = TahunLpTahunan2.getYear();
        String a= String.valueOf(tahun);
        Map param = new HashMap();
        File file = new File("src/Report/UPTahun.jrxml");
        try {
            JasperDesign jasperDesign =JRXmlLoader.load(file);
            param.put("ptahun",a);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,Koneksi.getConnection());
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void CbIdKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbIdKasirMouseClicked
        // TODO add your handling code here:
        Statement statement;
        try {
            CbIdKasir.removeAllItems();
            CbIdKasir.removeAllItems();
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from pegawai ";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                CbIdKasir.addItem(rs.getString("nama_pegawai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CbIdKasirMouseClicked

    private void CbIdKasirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbIdKasirItemStateChanged
        // TODO add your handling code here:
        Statement statement;
        try {
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from pegawai where nama_pegawai ='"+String.valueOf(CbIdKasir.getSelectedItem())+"'";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                NamaKasirPembelian.setText(rs.getString("id_pegawai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CbIdKasirItemStateChanged

    private void cbIdMemberPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbIdMemberPenjualanMouseClicked
        // TODO add your handling code here:
        try {
            cbIdMemberPenjualan.removeAllItems();
            cbIdMemberPenjualan.removeAllItems();
            Statement statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from member ";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdMemberPenjualan.addItem(rs.getString("nama_member"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cbIdMemberPenjualanMouseClicked

    private void cbIdSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbIdSuplierMouseClicked
        // TODO add your handling code here:
        Statement statement;
        try {
            cbIdSuplier.removeAllItems();
            cbIdSuplier.removeAllItems();
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from suplier";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdSuplier.addItem(rs.getString("nama_suplier"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdSuplierMouseClicked

    private void cbIdBarangPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbIdBarangPembelianMouseClicked
        // TODO add your handling code here:
        Statement statement;
        try {
            cbIdBarangPembelian.removeAllItems();
            cbIdBarangPembelian.removeAllItems();
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from barang";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdBarangPembelian.addItem(rs.getString("nama_barang"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdBarangPembelianMouseClicked

    private void cbIdJasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbIdJasaMouseClicked
        // TODO add your handling code here:
        Statement statement;
        try {
            cbIdJasa.removeAllItems();
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from jasa";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdJasa.addItem(rs.getString("nama_jasa"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdJasaMouseClicked

    private void cbIdPemotongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbIdPemotongMouseClicked
        // TODO add your handling code here:
        Statement statement;
        try {
            cbIdPemotong.removeAllItems();
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from pegawai";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdPemotong.addItem(rs.getString("nama_pegawai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdPemotongMouseClicked

    private void cbIdBarangPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbIdBarangPenjualanMouseClicked
        // TODO add your handling code here:
        Statement statement;
        try {
            cbIdBarangPenjualan.removeAllItems();
            statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from barang ";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdBarangPenjualan.addItem(rs.getString("nama_barang"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbIdBarangPenjualanMouseClicked

    private void btnHapusPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPenjualanActionPerformed
        // TODO add your handling code here:
        HapusPenjualan();
    }//GEN-LAST:event_btnHapusPenjualanActionPerformed
    private void IdPegawaiOtomatis(){
      
        try {
            sql="select * from pegawai order by id_pegawai desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id_pegawai = rs.getString("id_pegawai").substring(1);
                String AN = "" + (Integer.parseInt(id_pegawai) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                TxtIdPegawai.setText("G" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtIdPegawai.setText("G0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void IdMemberOtomotis(){
        try {
            sql="select * from member order by id_member desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id_member = rs.getString("id_member").substring(1);
                String AN = "" + (Integer.parseInt(id_member) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                TxtIdMember.setText("F" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtIdMember.setText("F0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void IdSuplierOtomatis(){
        try {
            sql="select * from suplier order by id_suplier desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id_suplier = rs.getString("id_suplier").substring(1);
                String AN = "" + (Integer.parseInt(id_suplier) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                TxtIdSuplier.setText("E" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtIdSuplier.setText("E0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void IdJasaOtomatis(){
        try {
            sql="select * from jasa order by id_jasa desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id_jasa = rs.getString("id_jasa").substring(1);
                String AN = "" + (Integer.parseInt(id_jasa) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                TxtIdJasa.setText("D" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtIdJasa.setText("D0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void IdBarangOtomatis(){
        try {
            sql="select * from barang order by id_barang desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String id_barang = rs.getString("id_barang").substring(1);
                String AN = "" + (Integer.parseInt(id_barang) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                txtIdBarang.setText("A" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                txtIdBarang.setText("A0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void IdPembelianOtomatis(){
        try {
            sql="select * from pembelian order by nonota_pembelian desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String nonota_pembelian = rs.getString("nonota_pembelian").substring(1);
                String AN = "" + (Integer.parseInt(nonota_pembelian) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                TxtIdPembelian.setText("B" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtIdPembelian.setText("B0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void IdPenjualanOtomatis(){
        try {
            sql="select * from penjualan order by nonota_penjualan desc";
            st = (Statement)Koneksi.getConnection().createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
                String nonota_pembelian = rs.getString("nonota_penjualan").substring(1);
                String AN = "" + (Integer.parseInt(nonota_pembelian) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
                TxtIdPenjualan.setText("C" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                TxtIdPenjualan.setText("C0001");//sesuaikan dengan variable namenya
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Content.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Content().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AlamatMember;
    private javax.swing.JTextArea AlamatPegawai;
    private javax.swing.JTextArea AlamatSuplier;
    private javax.swing.JPanel Barang;
    private javax.swing.JButton BayarPembelian;
    private com.toedter.calendar.JMonthChooser BulanLpBulanan;
    private com.toedter.calendar.JMonthChooser BulanLpBulanan1;
    private com.toedter.calendar.JMonthChooser BulanLpBulanan2;
    private javax.swing.JComboBox<String> CbIdKasir;
    private javax.swing.JPanel HakAkses;
    private javax.swing.JLabel HargaBarangPembelian;
    private javax.swing.JLabel HargaBarangPenjualan;
    private javax.swing.JTextField HargaBersihBarang;
    private javax.swing.JTextField HargaBersihJasa;
    private javax.swing.JLabel HargaJasaPenjualan;
    private javax.swing.JTextField HargaJualBarang;
    private javax.swing.JTextField HargaJualJasa;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Isi;
    private javax.swing.JPanel Jasa;
    private javax.swing.JPanel JasaDanBarang;
    private javax.swing.JTextField JumlahBarangPembelian;
    private javax.swing.JTextField JumlahBarangPenjualan;
    private javax.swing.JPanel Laporan;
    private javax.swing.JPanel LaporanPembelian;
    private javax.swing.JPanel LaporanPembelian1;
    private javax.swing.JPanel LaporanPembelian2;
    private javax.swing.JPanel LaporanPembelian3;
    private javax.swing.JPanel LaporanPenjualan;
    private javax.swing.JPanel LaporanPenjualan1;
    private javax.swing.JPanel LaporanPenjualan2;
    private javax.swing.JPanel LaporanPenjualan3;
    private javax.swing.JPanel LaporanUpahPegawai;
    private javax.swing.JPanel LaporanUpahPegawai1;
    private javax.swing.JPanel LaporanUpahPegawai2;
    private javax.swing.JPanel LaporanUpahPegawai3;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Member;
    private javax.swing.JTextField NamaBarang;
    private javax.swing.JTextField NamaBarangPembelian;
    private javax.swing.JTextField NamaBarangPenjualan;
    private javax.swing.JTextField NamaJasa;
    private javax.swing.JTextField NamaJasaPenjualan;
    private javax.swing.JTextField NamaKasirPembelian;
    private javax.swing.JTextField NamaMember;
    private javax.swing.JTextField NamaMemberPenjualan;
    private javax.swing.JTextField NamaPegawai;
    private javax.swing.JTextField NamaPemotongPenjualan;
    private javax.swing.JTextField NamaSuplier;
    private javax.swing.JTextField NamaSuplierPembelian;
    private javax.swing.JPanel Pegawai;
    private javax.swing.JTextField StokBarang;
    private javax.swing.JPanel Suplier;
    private javax.swing.JTable TabelBarang;
    private javax.swing.JTable TabelHakUser;
    private javax.swing.JTable TabelJasa;
    private javax.swing.JTable TabelMember;
    private javax.swing.JTable TabelPegawai;
    private javax.swing.JTable TabelPembelian;
    private javax.swing.JTable TabelPenjualan;
    private javax.swing.JTable TabelStokBarang;
    private javax.swing.JTable TabelSuplier;
    private com.toedter.calendar.JYearChooser TahunLpBulanan;
    private com.toedter.calendar.JYearChooser TahunLpBulanan1;
    private com.toedter.calendar.JYearChooser TahunLpBulanan2;
    private com.toedter.calendar.JYearChooser TahunLpTahunan;
    private com.toedter.calendar.JYearChooser TahunLpTahunan1;
    private com.toedter.calendar.JYearChooser TahunLpTahunan2;
    private javax.swing.JButton TambahBarangPenjualan;
    private javax.swing.JButton TambahJasaPenjualan;
    private javax.swing.JButton TambahPembelian;
    private com.toedter.calendar.JDateChooser TanggalLpHarian;
    private com.toedter.calendar.JDateChooser TanggalLpHarian1;
    private com.toedter.calendar.JDateChooser TanggalLpHarian2;
    private com.toedter.calendar.JDateChooser TanggalPembelian;
    private com.toedter.calendar.JDateChooser TanggalPenjualan;
    private javax.swing.JTextField TeleponPegawai;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel TotalBayarPenjualan;
    private javax.swing.JLabel TotalPembelian;
    private javax.swing.JPanel Transaksi;
    private javax.swing.JPanel TransaksiPembelian;
    private javax.swing.JPanel TransaksiPenjualan;
    private javax.swing.JLabel TxtIdJasa;
    private javax.swing.JLabel TxtIdMember;
    private javax.swing.JLabel TxtIdPegawai;
    private javax.swing.JLabel TxtIdPembelian;
    private javax.swing.JLabel TxtIdPenjualan;
    private javax.swing.JLabel TxtIdSuplier;
    private javax.swing.JButton btnBayarPenjualan;
    private javax.swing.JButton btnBersihBarang;
    private javax.swing.JButton btnBersihHakAkses;
    private javax.swing.JButton btnBersihJasa;
    private javax.swing.JButton btnBersihMember;
    private javax.swing.JButton btnBersihPegawai;
    private javax.swing.JButton btnBersihSuplier;
    private javax.swing.JButton btnHapusBarang;
    private javax.swing.JButton btnHapusHakAkses;
    private javax.swing.JButton btnHapusJasa;
    private javax.swing.JButton btnHapusMember;
    private javax.swing.JButton btnHapusPegawai;
    private javax.swing.JButton btnHapusPenjualan;
    private javax.swing.JButton btnHapusSuplier;
    private javax.swing.JButton btnLaporanBulananPenjualan;
    private javax.swing.JButton btnLaporanHarianPenjualan;
    private javax.swing.JButton btnLaporanTahunanPenjualan;
    private javax.swing.JButton btnSimpanBarang;
    private javax.swing.JButton btnSimpanHakAkses;
    private javax.swing.JButton btnSimpanJasa;
    private javax.swing.JButton btnSimpanMember;
    private javax.swing.JButton btnSimpanPegawai;
    private javax.swing.JButton btnSimpanSuplier;
    private javax.swing.JButton btnUbahBarang;
    private javax.swing.JButton btnUbahJasa;
    private javax.swing.JButton btnUbahMember;
    private javax.swing.JButton btnUbahPegawai;
    private javax.swing.JButton btnUbahSuplier;
    private javax.swing.JComboBox<String> cbIdBarangPembelian;
    private javax.swing.JComboBox<String> cbIdBarangPenjualan;
    private javax.swing.JComboBox<String> cbIdJasa;
    private javax.swing.JComboBox<String> cbIdMemberPenjualan;
    private javax.swing.JComboBox<String> cbIdPemotong;
    private javax.swing.JComboBox<String> cbIdSuplier;
    private javax.swing.JComboBox<String> cmbUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leftHakAkses;
    private javax.swing.JPanel leftHome;
    private javax.swing.JPanel leftJasaBarang;
    private javax.swing.JPanel leftLaporan;
    private javax.swing.JPanel leftMember;
    private javax.swing.JPanel leftPegawai;
    private javax.swing.JPanel leftSuplier;
    private javax.swing.JPanel leftTransaksi;
    private javax.swing.JTextField telpMember;
    private javax.swing.JTextField telpSuplier;
    private javax.swing.JLabel txtIdBarang;
    private javax.swing.JLabel txtNamaUSerLogin;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel txtfee;
    // End of variables declaration//GEN-END:variables

public void TampilDataPegawai(){
    model.getDataVector().removeAllElements();
    model.fireTableDataChanged();
    try {
            Statement statement=(Statement)Koneksi.getConnection().createStatement();
            String sql="Select * from pegawai";
            ResultSet rs = statement.executeQuery(sql);
            Object[]obj = new Object[5];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("id_pegawai");
                obj[2]=rs.getString("nama_pegawai");
                obj[3]=rs.getString("telp_pegawai");
                obj[4]=rs.getString("alamat_pegawai");
                x++;
                model.addRow(obj);
            }
    } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
public void TampilDataMember(){
    modelmember.getDataVector().removeAllElements();
    modelmember.fireTableDataChanged();
    try {
            Statement statement=(Statement)Koneksi.getConnection().createStatement();
            String sql="Select * from member";
            ResultSet rs = statement.executeQuery(sql);
            Object[]obj = new Object[5];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("id_member");
                obj[2]=rs.getString("nama_member");
                obj[3]=rs.getString("telp_member");
                obj[4]=rs.getString("alamat_member");
                x++;
                modelmember.addRow(obj);
            }
    } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

public void TampilDataHakAkses(){
    modelhakakses.getDataVector().removeAllElements();
    modelhakakses.fireTableDataChanged();
        try {
            Statement statement=(Statement)Koneksi.getConnection().createStatement();
            String sql="Select * from hakakses";
            ResultSet rs = statement.executeQuery(sql);
            Object []obj=new Object[3];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("username");
                obj[2]=rs.getString("user");
                x++;
                modelhakakses.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void TampilDataSuplier(){
    modelsuplier.getDataVector().removeAllElements();
    modelsuplier.fireTableDataChanged();
        try {
            Statement statement=(Statement)Koneksi.getConnection().createStatement();
            String sql="Select * from suplier";
            ResultSet rs = statement.executeQuery(sql);
            Object []obj=new Object[5];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("id_suplier");
                obj[2]=rs.getString("nama_suplier");
                obj[3]=rs.getString("telp_suplier");
                obj[4]=rs.getString("alamat_suplier");
                x++;
                modelsuplier.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
private void TampilDataJasa(){
    modeljasa.getDataVector().removeAllElements();
    modeljasa.fireTableDataChanged();
        try {
            Statement statement = (Statement)Koneksi.getConnection().createStatement();
            String sql ="Select *from jasa";
            ResultSet rs = statement.executeQuery(sql);
            Object []obj= new Object[6];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("id_jasa");
                obj[2]=rs.getString("nama_jasa");
                obj[3]=rs.getInt("harga_bersih");
                obj[4]=rs.getInt("harga_jual");
                obj[5]=rs.getInt("fee");
                x++;
                modeljasa.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}


public void BersihPegawai(){
    NamaPegawai.setText("");
    TeleponPegawai.setText("");
    AlamatPegawai.setText("");
}
public void BersihMember(){
    NamaMember.setText("");
    telpMember.setText("");
    AlamatMember.setText("");
}
public void BersihSuplier(){
    NamaSuplier.setText("");
    telpSuplier.setText("");
    AlamatSuplier.setText("");
}
public void BersihJasa(){
    NamaJasa.setText("");
    HargaBersihJasa.setText("");
    HargaJualJasa.setText("");
    txtfee.setText("---");
    
}
public void BersihBarang(){
    NamaBarang.setText("");
    HargaJualBarang.setText("");
    HargaBersihBarang.setText("");
}
public void cleantablepembelian(){
    int baris=modelpembelian.getRowCount();
    for(int i=0;i<baris;i++){
        modelpembelian.removeRow(0);
    }
}
public void cleantablepenjualan(){
    int baris=modelpenjualan.getRowCount();
    for(int i=0;i<baris;i++){
        modelpenjualan.removeRow(0);
    }
}
public void simpantabelpembelian(){
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String tp =String.valueOf(df.format(TanggalPembelian.getDate()));
    try {
            Statement statement =(Statement)Koneksi.getConnection().createStatement();
            String sql = "update pembelian set tanggal='"+tp+"',kasir='"+NamaKasirPembelian.getText()+"',id_suplier='"+NamaSuplierPembelian.getText()+"',total_penjualan="+Integer.parseInt(TotalPembelian.getText())+" where nonota_pembelian='"+TxtIdPembelian.getText()+"'";
            
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void BersihHakAkses(){
    txtUserName.setText("");
    txtPassword.setText("");
}

    public void setBarang(JPanel Barang,boolean b) {
        this.Barang = Barang;
        Barang.setEnabled(b);
    }

    public void setHakAkses(JPanel HakAkses,boolean b) {
        this.HakAkses = HakAkses;
        HakAkses.setEnabled(b);
    }

    public void setJasa(JPanel Jasa,boolean b) {
        this.Jasa = Jasa;
        HakAkses.setEnabled(b);
    }

    public void setJasaDanBarang(JPanel JasaDanBarang,boolean b) {
        this.JasaDanBarang = JasaDanBarang;
        JasaDanBarang.setEnabled(b);
    }

    public void setLaporan(JPanel Laporan,boolean b) {
        this.Laporan = Laporan;
        Laporan.setEnabled(b);
    }

    public void setMember(JPanel Member,boolean b) {
        this.Member = Member;
        Member.setEnabled(b);
    }

    public void setPegawai(JPanel Pegawai,boolean b) {
        this.Pegawai = Pegawai;
        Pegawai.setEnabled(b);
    }

    public void setSuplier(JPanel Suplier, boolean b) {
        this.Suplier = Suplier;
        Suplier.setEnabled(b);
    }

    public void setTransaksi(JPanel Transaksi,boolean b) {
        this.Transaksi = Transaksi;
        Transaksi.setEnabled(b);
    }

    public void setTransaksiPembelian(JPanel TransaksiPembelian,boolean b) {
        this.TransaksiPembelian = TransaksiPembelian;
        TransaksiPembelian.setEnabled(b);
    }

    public void setTransaksiPenjualan(JPanel TransaksiPenjualan,boolean b) {
        this.TransaksiPenjualan = TransaksiPenjualan;
        TransaksiPenjualan.setEnabled(b);
    }

    public void setTxtNamaUSerLogin(String a) {
        txtNamaUSerLogin.setText(""+a);
    }
    
    public int cekStok1(){
        int stok =0;
        String b = "select stok from barang where id_barang='"+NamaBarangPembelian.getText()+"'";
        try {
            Statement statement = Koneksi.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(b);
            while(rs.next()){
                stok = Integer.parseInt(rs.getString("stok"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stok;
    }
    
    public int cekStok2(){
        int stokk =0;
        String b = "select stok from barang where id_barang='"+NamaBarangPenjualan.getText()+"'";
        try {
            Statement statement = Koneksi.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(b);
            while(rs.next()){
                stokk = Integer.parseInt(rs.getString("stok"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stokk;
    }
    public void UpdateStok(String b){
        int stokbaru=0;
        int total;      
        try {
            Statement statement = Koneksi.getConnection().createStatement();
            String query = "";
        if(b.equals("tambah")){
            stokbaru=cekStok1()+Integer.parseInt(JumlahBarangPembelian.getText());
            query ="Update barang set stok ="+stokbaru+" where id_barang ='"+NamaBarangPembelian.getText()+"'";
        }else if(b.equals("kurang")){
            stokbaru=cekStok2()-Integer.parseInt(JumlahBarangPenjualan.getText());
            if(stokbaru!=0){
            query ="Update barang set stok ="+stokbaru+" where id_barang ='"+NamaBarangPenjualan.getText()+"'";
            }else if(stokbaru==0){
                JOptionPane.showMessageDialog(Left, "Stok Habis");
            }
        }
         statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    private void TampilDataBarangStok(){
    modelstokbarang.getDataVector().removeAllElements();
    modelstokbarang.fireTableDataChanged();
    try {
            Statement statement = (Statement)Koneksi.getConnection().createStatement();
            String sql ="Select *from  barang";
            ResultSet rs = statement.executeQuery(sql);
            Object []obj= new Object[4];
            int x=1;
            while(rs.next()){
                obj[0]=x;
                obj[1]=rs.getString("id_barang");
                obj[2]=rs.getString("nama_barang");
                obj[3]=rs.getInt("stok");
                x++;
                modelstokbarang.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void TampilIdMemberPenjualan(){
        try {
            Statement statement = (Statement)Koneksi.getConnection().createStatement();
            String sql = "Select * from member ";
            ResultSet  rs = statement.executeQuery(sql);
            while(rs.next()){
                cbIdMemberPenjualan.addItem(rs.getString("nama_member"));
            }
            rs.last();
            int jumlahdata=rs.getRow();
            rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void HapusPenjualan(){
        int x= TabelPenjualan.getSelectedRow();
        Object y = TabelPenjualan.getValueAt(x, 1);
        if(y==TambahJasa){
            try {
                Statement statement = (Statement)Koneksi.getConnection().createStatement();
                String sql = "Delete from detail_jasa where nonota_penjualan like '"+TxtIdPenjualan.getText()+"'";
                statement.executeUpdate(sql);
                statement.close();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                int baris=modelpenjualan.getRowCount();
                modelpenjualan.removeRow(x);
            } catch (SQLException ex) {
                Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (y==TambahBarang){
            
        }
    }
    
    public void HapusPembelian(){
        
    }
}
