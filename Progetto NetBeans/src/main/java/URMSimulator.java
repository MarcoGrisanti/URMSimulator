import javax.swing.filechooser.FileNameExtensionFilter;

public class URMSimulator extends javax.swing.JFrame {
    
    public URMSimulator() {
        initComponents();
        myTimer = new javax.swing.Timer(500, (java.awt.event.ActionEvent e) -> {
            runMachine();
            if (index == getEndPosition() + 2) myTimer.stop();
        });
        loadCurrentPath();
    }

    @SuppressWarnings("unchecked")
    //<editor-fold defaultstate="collapsed" desc="Generated Code"> //GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        codeScrollPane = new javax.swing.JScrollPane();
        codeTextArea = new javax.swing.JTextArea();
        createRegistersButton = new javax.swing.JButton();
        machineScrollPane = new javax.swing.JScrollPane();
        machinePanel = new javax.swing.JPanel();
        myFileChooser = new javax.swing.JFileChooser();
        pauseButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        timerDelayTextField = new javax.swing.JTextField();
        timerDelayButton = new javax.swing.JButton();
        increaseFontSizeButton = new javax.swing.JButton();
        decreaseFontSizeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("URMSimulator");

        startButton.setText("Start");
        startButton.setName(""); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.setName(""); // NOI18N
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        codeTextArea.setEditable(false);
        codeTextArea.setColumns(20);
        codeTextArea.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        codeTextArea.setRows(5);
        codeScrollPane.setViewportView(codeTextArea);

        createRegistersButton.setText("Create/Reset Registers");
        createRegistersButton.setName(""); // NOI18N
        createRegistersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRegistersButtonActionPerformed(evt);
            }
        });

        machineScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        machineScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        machinePanel.setPreferredSize(new java.awt.Dimension(32767, 100));

        javax.swing.GroupLayout machinePanelLayout = new javax.swing.GroupLayout(machinePanel);
        machinePanel.setLayout(machinePanelLayout);
        machinePanelLayout.setHorizontalGroup(
            machinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        machinePanelLayout.setVerticalGroup(
            machinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        machineScrollPane.setViewportView(machinePanel);

        myFileChooser.setAcceptAllFileFilterUsed(false);
        myFileChooser.setControlButtonsAreShown(false);
        myFileChooser.setDialogTitle("");
        myFileChooser.setFileFilter(new FileNameExtensionFilter("URM File (*.urm)", "urm"));
        myFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myFileChooserActionPerformed(evt);
            }
        });

        pauseButton.setText("Pause");
        pauseButton.setName(""); // NOI18N
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Prev");
        prevButton.setName(""); // NOI18N
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        timerDelayTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timerDelayTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timerDelayTextField.setText("500");

        timerDelayButton.setText("Set Timer Delay (ms)");
        timerDelayButton.setName(""); // NOI18N
        timerDelayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerDelayButtonActionPerformed(evt);
            }
        });

        increaseFontSizeButton.setText("Increase Font Size");
        increaseFontSizeButton.setName(""); // NOI18N
        increaseFontSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseFontSizeButtonActionPerformed(evt);
            }
        });

        decreaseFontSizeButton.setText("Decrease Font Size");
        decreaseFontSizeButton.setName(""); // NOI18N
        decreaseFontSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseFontSizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(myFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(machineScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createRegistersButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decreaseFontSizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(increaseFontSizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timerDelayButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timerDelayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createRegistersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timerDelayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(timerDelayTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(increaseFontSizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(decreaseFontSizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(machineScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(codeScrollPane))
                .addContainerGap())
        );

        pack();
    }
    //</editor-fold> //GEN-END:initComponents

    private void saveCurrentPath() {
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter("./currentPath.txt");
            fileWriter.write(myFileChooser.getCurrentDirectory().toString());
            fileWriter.flush();
            fileWriter.close();
        }
        catch (java.io.IOException ex) {
            System.out.println(ex);
        }
    }
    
    private void loadCurrentPath() {
        try {
            java.io.FileReader fileReader = new java.io.FileReader("./currentPath.txt");
            java.io.BufferedReader in = new java.io.BufferedReader(fileReader);
            String path = in.readLine();
            in.close();
            fileReader.close();
            myFileChooser.setCurrentDirectory(new java.io.File(path));
        }
        catch(java.io.IOException ex) {
            System.out.println(ex);
        }
    }
    
    private void openURMFile() {
        try {
            java.io.FileReader fileReader = new java.io.FileReader(myFileChooser.getSelectedFile().toString());
            java.io.BufferedReader in = new java.io.BufferedReader(fileReader);
            String line;
            while ((line = in.readLine()) != null) codeTextArea.setText(codeTextArea.getText() + line + "\n");
            in.close();
            fileReader.close();
        }
        catch (java.io.FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (java.io.IOException ex) {
            System.out.println(ex);
        }
    }
    
    private void deleteCursor() {
        StringBuilder stringBuilder = new StringBuilder(codeTextArea.getText());
        if (stringBuilder.indexOf(">") > -1) stringBuilder.deleteCharAt(stringBuilder.indexOf(">"));
        codeTextArea.setText(stringBuilder.toString());
    }
    
    private void manageCursor() {
        deleteCursor();
        StringBuilder stringBuilder = new StringBuilder(codeTextArea.getText());
        for (int i = index - 1; i >= 0; i--) {
            if (codeTextArea.getText().charAt(i) == '\n') {
                if (index < getEndPosition() - 1) stringBuilder.insert(i + 1, '>');
                codeTextArea.setText(stringBuilder.toString());
                break;
            }
        }
    }
    
    private int getStartPosition() {
        String start = "main";
        int i = codeTextArea.getText().indexOf(start);
        return i + start.length() + 2;
    }
    
    private int getEndPosition() {
        int i = getStartPosition();
        while (codeTextArea.getText().charAt(i) != '\'') { i++; }
        return i;
    }
    
    private int getNumberOfRegisters() {
        int max = 0;
        String code = codeTextArea.getText();
        for (int i = getStartPosition(); i < getEndPosition(); i++) {
            char c = code.charAt(i);
            switch (c) {
                case 'Z':
                case 'S':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ')') { j++; }
                        String register = code.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = j + 1;
                        break;
                    }
                case 'T':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        String register = code.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        int k = j + 2;
                        while (code.charAt(k) != ')') { k++; }
                        register = code.substring(j + 2, k);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = k + 1;
                        break;
                    }
                case 'J':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        String register = code.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        int k = j + 2;
                        while (code.charAt(k) != ',') { k++; }
                        register = code.substring(j + 2, k);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = k + 1;
                        break;
                    }
                case 'M':
                case 'I':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        String register = code.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = j + 1;
                        break;
                    }
                case 'i':
                    {
                        if (code.charAt(i + 1) != 'n' ||
                            code.charAt(i + 2) != 'p' ||
                            code.charAt(i + 3) != 'u' ||
                            code.charAt(i + 4) != 't') {
                            break;
                        }
                        int j = i + 6;
                        while (code.charAt(j) != ')') { j++; }
                        String register = code.substring(i + 6, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = j + 1;
                        break;
                    }
                default:
                    break;
            }
        }
        return max;
    }
    
    private int getNumberOfMacroRegisters(String macro) {
        int max = 0;
        for (int i = 0; i < macro.length(); i++) {
            char c = macro.charAt(i);
            switch (c) {
                case 'Z':
                case 'S':
                    {
                        int j = i + 2;
                        while (macro.charAt(j) != ')') { j++; }
                        String register = macro.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = j + 1;
                        break;
                    }
                case 'T':
                    {
                        int j = i + 2;
                        while (macro.charAt(j) != ',') { j++; }
                        String register = macro.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        int k = j + 2;
                        while (macro.charAt(k) != ')') { k++; }
                        register = macro.substring(j + 2, k);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = k + 1;
                        break;
                    }
                case 'J':
                    {
                        int j = i + 2;
                        while (macro.charAt(j) != ',') { j++; }
                        String register = macro.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        int k = j + 2;
                        while (macro.charAt(k) != ',') { k++; }
                        register = macro.substring(j + 2, k);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = k + 1;
                        break;
                    }
                case 'M':
                case 'I':
                    {
                        int j = i + 2;
                        while (macro.charAt(j) != ',') { j++; }
                        String register = macro.substring(i + 2, j);
                        if (max < Integer.parseInt(register)) {
                            max = Integer.parseInt(register);
                        }
                        i = j + 1;
                        break;
                    }
                default:
                    break;
            }
        }
        return max;
    }
    
    private void restoreRegisters() {
        deleteCursor();
        programCounter = 0;
        index = getStartPosition();
        machinePanel.removeAll();
        machinePanel.revalidate();
        machinePanel.repaint();
        registers = new java.util.LinkedList<>();
        int n = getNumberOfRegisters();
        for (int i = 0, distance = 3; i < n; i++, distance = distance + 170) {
            javax.swing.JTextField newRegister = new javax.swing.JTextField(startRegisters.get(i).getText());
            newRegister.setFont(new java.awt.Font("Monospace", java.awt.Font.PLAIN, 70));
            newRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            newRegister.setBounds(distance, 15, 170, 100);
            newRegister.setEditable(true);
            registers.add(newRegister);
        }
        registers.forEach((myRegister) -> {
            machinePanel.add(myRegister);
        });
    }
    
    private void createRegisters() {
        deleteCursor();
        programCounter = 0;
        index = getStartPosition();
        machinePanel.removeAll();
        machinePanel.revalidate();
        machinePanel.repaint();
        registers = new java.util.LinkedList<>();
        int n = getNumberOfRegisters();
        for (int i = 0, distance = 3; i < n; i++, distance = distance + 170) {
            javax.swing.JTextField newRegister = new javax.swing.JTextField("0");
            newRegister.setFont(new java.awt.Font("Monospace", java.awt.Font.PLAIN, 70));
            newRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            newRegister.setBounds(distance, 15, 170, 100);
            newRegister.setEditable(true);
            registers.add(newRegister);
        }
        registers.forEach((myRegister) -> {
            machinePanel.add(myRegister);
        });
    }
    
    private void createMacroRegisters(java.util.LinkedList<Integer> macroRegisters, String macro) {
        int n = getNumberOfMacroRegisters(macro);
        for (int i = 0; i < n; i++) macroRegisters.add(0);
    }
    
    private void initializeRegisters() {
        String code = codeTextArea.getText();
        for (int i = getStartPosition(); i < getEndPosition(); i++) {
            if (code.charAt(i) == 'I') {
                int j = i + 2;
                while (code.charAt(j) != ',') { j++; }
                String register = code.substring(i + 2, j);
                int k = j + 2;
                while (code.charAt(k) != ')') { k++; }
                String value = code.substring(j + 2, k);
                if (Integer.parseInt(registers.get(Integer.parseInt(register) - 1).getText()) == 0) registers.get(Integer.parseInt(register) - 1).setText(value);
                i = k + 1;
            }
        }
    }
    
    private void initializeMacroRegisters(java.util.LinkedList<Integer> macroRegisters, String macro) {
        for (int i = 0; i < macro.length(); i++) {
            if (macro.charAt(i) == 'I') {
                int j = i + 2;
                while (macro.charAt(j) != ',') { j++; }
                String register = macro.substring(i + 2, j);
                int k = j + 2;
                while (macro.charAt(k) != ')') { k++; }
                String value = macro.substring(j + 2, k);
                macroRegisters.set(Integer.parseInt(register) - 1, Integer.parseInt(value));
                i = k + 1;
            }
        }
    }
    
    private void saveStartRegisters() {
        startRegisters = new java.util.LinkedList<>();
        for (javax.swing.JTextField register : registers) {
            javax.swing.JTextField newRegister = new javax.swing.JTextField();
            newRegister.setText(register.getText());
            startRegisters.add(newRegister);
        }
    }
    
    private void runMachine() {
        if (index == getStartPosition()) saveStartRegisters();
        manageCursor();
        String code = codeTextArea.getText();
        if (code.length() == index) return;
        char c = code.charAt(index);
        switch (c) {
            case 'Z':
                {
                    int j = index + 2;
                    while (code.charAt(j) != ')') { j++; }
                    String register = code.substring(index + 2, j);
                    registers.get(Integer.parseInt(register) - 1).setText("0");
                    index = j + 1;
                    programCounter++;
                    break;
                }
            case 'S':
                {
                    int j = index + 2;
                    while (code.charAt(j) != ')') { j++; }
                    String register = code.substring(index + 2, j);
                    int oldValue = Integer.parseInt(registers.get(Integer.parseInt(register) - 1).getText());
                    int newValue = oldValue + 1;
                    registers.get(Integer.parseInt(register) - 1).setText(Integer.toString(newValue));
                    index = j + 1;
                    programCounter++;
                    break;
                }
            case 'T':
                {
                    int j = index + 2;
                    while (code.charAt(j) != ',') { j++; }
                    String register1 = code.substring(index + 2, j);
                    int k = j + 2;
                    while (code.charAt(k) != ')') { k++; }
                    String register2 = code.substring(j + 2, k);
                    registers.get(Integer.parseInt(register2) - 1).setText(registers.get(Integer.parseInt(register1) - 1).getText());
                    index = k + 1;
                    programCounter++;
                    break;
                }
            case 'J':
                {
                    int j = index + 2;
                    while (code.charAt(j) != ',') { j++; }
                    String register1 = code.substring(index + 2, j);
                    int k = j + 2;
                    while (code.charAt(k) != ',') { k++; }
                    String register2 = code.substring(j + 2, k);
                    int h = k + 2;
                    while (code.charAt(h) != ')') { h++; }
                    int codeLine = Integer.parseInt(code.substring(k + 2, h));
                    if (registers.get(Integer.parseInt(register1) - 1).getText().equals(registers.get(Integer.parseInt(register2) - 1).getText())) {
                        int v = 0;
                        int w = 1;
                        while (v < code.length() && w < codeLine) {
                            if (code.charAt(v) == '\n') { w++; }
                            v++;
                        }
                        index = v;
                        programCounter++;
                        break;
                    }
                    index = h + 1;
                    programCounter++;
                    break;
                }
            case 'M':
                {
                    int j = index + 2;
                    while (code.charAt(j) != ',') { j++; }
                    String register = code.substring(index + 2, j);
                    int k = j + 2;
                    while (code.charAt(k) != '(') { k++; }
                    String macroName = code.substring(j + 2, k);
                    java.util.LinkedList<Integer> parameters = new java.util.LinkedList<>();
                    int p = k + 1;
                    while (code.charAt(p) != ')') {
                        int q = p;
                        while (code.charAt(q) != ',' && code.charAt(q) != ')') { q++; }
                        parameters.add(Integer.parseInt(code.substring(p, q)));
                        if (code.charAt(q) == ')') {
                            index = q + 2;
                            break;
                        }
                        p = q + 2;
                    }
                    int macroStart = code.indexOf(macroName);
                    macroStart = macroStart + macroName.length() + 2;
                    int i = macroStart;
                    while (code.charAt(i) != '\'') { i++; }
                    int macroEnd = i - 1;
                    String macro = code.substring(macroStart, macroEnd);
                    java.util.LinkedList<Integer> macroRegisters = new java.util.LinkedList<>();
                    createMacroRegisters(macroRegisters, macro);
                    for (int x = 0; x < macroRegisters.size() && x < parameters.size(); x++) macroRegisters.set(x, Integer.parseInt(registers.get(parameters.get(x) - 1).getText()));
                    initializeMacroRegisters(macroRegisters, macro);
                    registers.get(Integer.parseInt(register) - 1).setText(Integer.toString(runMacroMachine(macroRegisters, macro, code)));
                    programCounter++;
                    break;
                }
            case 'I':
                {
                    int j = index + 2;
                    while (code.charAt(j) != ',') { j++; }
                    int k = j + 2;
                    while (code.charAt(k) != ')') { k++; }
                    index = k + 1;
                    programCounter++;
                    break;
                }
            case 'i':
                {
                    if (code.charAt(index + 1) != 'n' ||
                        code.charAt(index + 2) != 'p' ||
                        code.charAt(index + 3) != 'u' ||
                        code.charAt(index + 4) != 't') {
                        break;
                    }
                    int j = index + 6;
                    while (code.charAt(j) != ')') { j++; }
                    index = j + 1;
                    programCounter++;
                    break;
                }
            default:
                break;
        }
        index++;
    }
    
    private int runMacroMachine(java.util.LinkedList<Integer> macroRegisters, String macro, String code) {
        for (int i = code.indexOf(macro); i < code.indexOf(macro) + macro.length(); i++) {
            char c = code.charAt(i);
            switch (c) {
                case 'Z':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ')') { j++; }
                        String register = code.substring(i + 2, j);
                        macroRegisters.set(Integer.parseInt(register) - 1, 0);
                        i = j + 1;
                        break;
                    }
                case 'S':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ')') { j++; }
                        String register = code.substring(i + 2, j);
                        int oldValue = macroRegisters.get(Integer.parseInt(register) - 1);
                        int newValue = oldValue + 1;
                        macroRegisters.set(Integer.parseInt(register) - 1, newValue);
                        i = j + 1;
                        break;
                    }
                case 'T':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        String register1 = code.substring(i + 2, j);
                        int k = j + 2;
                        while (code.charAt(k) != ')') { k++; }
                        String register2 = code.substring(j + 2, k);
                        macroRegisters.set(Integer.parseInt(register2) - 1, macroRegisters.get(Integer.parseInt(register1) - 1));
                        i = k + 1;
                        break;
                    }
                case 'J':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        String register1 = code.substring(i + 2, j);
                        int k = j + 2;
                        while (code.charAt(k) != ',') { k++; }
                        String register2 = code.substring(j + 2, k);
                        int h = k + 2;
                        while (code.charAt(h) != ')') { h++; }
                        int codeLine = Integer.parseInt(code.substring(k + 2, h));
                        if (macroRegisters.get(Integer.parseInt(register1) - 1).equals(macroRegisters.get(Integer.parseInt(register2) - 1))) {
                            int v = 0;
                            int w = 1;
                            while (v < code.length() && w < codeLine) {
                                if (code.charAt(v) == '\n') { w++; }
                                v++;
                            }
                            i = v - 1;
                            break;
                        }
                        i = h + 1;
                        break;
                    }
                case 'M':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        String register = code.substring(i + 2, j);
                        int k = j + 2;
                        while (code.charAt(k) != '(') { k++; }
                        String subMacroName = code.substring(j + 2, k);
                        java.util.LinkedList<Integer> parameters = new java.util.LinkedList<>();
                        int p = k + 1;
                        while (code.charAt(p) != ')') {
                            int q = p;
                            while (code.charAt(q) != ',' && code.charAt(q) != ')') { q++; }
                            parameters.add(Integer.parseInt(code.substring(p, q)));
                            if (code.charAt(q) == ')') {
                                i = q + 2;
                                break;
                            }
                            p = q + 2;
                        }
                        int subMacroStart = code.indexOf(subMacroName);
                        subMacroStart = subMacroStart + subMacroName.length() + 2;
                        int v = subMacroStart;
                        while (code.charAt(v) != '\'') { v++; }
                        int subMacroEnd = v - 1;
                        String subMacro = code.substring(subMacroStart, subMacroEnd);
                        java.util.LinkedList<Integer> subMacroRegisters = new java.util.LinkedList<>();
                        createMacroRegisters(subMacroRegisters, subMacro);
                        for (int x = 0; x < subMacroRegisters.size() && x < parameters.size(); x++) subMacroRegisters.set(x, macroRegisters.get(parameters.get(x) - 1));
                        initializeMacroRegisters(subMacroRegisters, subMacro);
                        macroRegisters.set(Integer.parseInt(register) - 1, runMacroMachine(subMacroRegisters, subMacro, code));
                        break;
                    }
                case 'I':
                    {
                        int j = i + 2;
                        while (code.charAt(j) != ',') { j++; }
                        int k = j + 2;
                        while (code.charAt(k) != ')') { k++; }
                        i = k + 1;
                        break;
                    }
                default:
                    break;
            }
        }
        return macroRegisters.get(0);
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        myTimer.start();      
    }//GEN-LAST:event_startButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (index < codeTextArea.getText().length()) runMachine();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void myFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myFileChooserActionPerformed
        codeTextArea.setText("");
        openURMFile();
        saveCurrentPath();
    }//GEN-LAST:event_myFileChooserActionPerformed

    private void createRegistersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRegistersButtonActionPerformed
        createRegisters();
        initializeRegisters();
    }//GEN-LAST:event_createRegistersButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        myTimer.stop();
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        int newProgramCounter = programCounter - 1;
        restoreRegisters();
        while (programCounter != newProgramCounter) runMachine();
    }//GEN-LAST:event_prevButtonActionPerformed

    private void timerDelayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerDelayButtonActionPerformed
        myTimer.setDelay(Integer.parseInt(timerDelayTextField.getText()));
    }//GEN-LAST:event_timerDelayButtonActionPerformed

    private void increaseFontSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseFontSizeButtonActionPerformed
        codeTextArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, codeTextArea.getFont().getSize() + 2));
    }//GEN-LAST:event_increaseFontSizeButtonActionPerformed

    private void decreaseFontSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseFontSizeButtonActionPerformed
        codeTextArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, codeTextArea.getFont().getSize() - 2));
    }//GEN-LAST:event_decreaseFontSizeButtonActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and Feel Setting Code">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(URMSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new URMSimulator().setVisible(true);
        });
    }
    
    private java.util.LinkedList<javax.swing.JTextField> registers;
    private java.util.LinkedList<javax.swing.JTextField> startRegisters;
    private javax.swing.Timer myTimer;
    private int programCounter;
    private int index;
    
    // Variables Declaration - Do Not Modify //GEN-BEGIN:variables
    private javax.swing.JScrollPane codeScrollPane;
    private javax.swing.JTextArea codeTextArea;
    private javax.swing.JButton createRegistersButton;
    private javax.swing.JButton decreaseFontSizeButton;
    private javax.swing.JButton increaseFontSizeButton;
    private javax.swing.JPanel machinePanel;
    private javax.swing.JScrollPane machineScrollPane;
    private javax.swing.JFileChooser myFileChooser;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton timerDelayButton;
    private javax.swing.JTextField timerDelayTextField;
    // End of Variables Declaration //GEN-END:variables
}