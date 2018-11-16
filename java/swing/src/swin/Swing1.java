package swin;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.ToolBar;

public class Swing1 {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Swing1 window = new Swing1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
//		shell = new Shell();
//		shell.setLayout(new GridLayout(1, false));
//		
		Menu menuBar,fileMenu, AppointMenu,PoliciesMenu,ClientsMenu;

		  MenuItem fileMenuHeader, AppointMenuHeader,PoliciesMenuHeader,ClientsMenuHeader;

		  MenuItem fileSaveItem;
		
			
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(266, 200);
		shell.setMinimumSize(new Point(500, 500));
				    
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 4;
				
		GridData gd = new GridData(GridData.FILL_BOTH);
		 gd = new GridData(GridData.FILL_HORIZONTAL);
		  		 
		shell.setLayout(gridLayout);
		
		menuBar = new Menu(shell, SWT.BAR);
	    fileMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
	    fileMenuHeader.setText("&claim");

	    fileMenu = new Menu(shell, SWT.DROP_DOWN);
	    fileMenuHeader.setMenu(fileMenu);
	    
	    fileSaveItem = new MenuItem(fileMenu, SWT.PUSH);
	    fileSaveItem.setText("&Save");
	    
	    fileSaveItem = new MenuItem(fileMenu, SWT.PUSH);
	    fileSaveItem.setText("&New item");
	    
	    AppointMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
	    AppointMenuHeader.setText("&Appointment");

	    AppointMenu = new Menu(shell, SWT.DROP_DOWN);
	    AppointMenuHeader.setMenu(AppointMenu);

	    PoliciesMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
	    PoliciesMenuHeader.setText("&Policies");

	    PoliciesMenu = new Menu(shell, SWT.DROP_DOWN);
	    PoliciesMenuHeader.setMenu(PoliciesMenu);

	    ClientsMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
	    ClientsMenuHeader.setText("&Policies");

	    ClientsMenu = new Menu(shell, SWT.DROP_DOWN);
	    ClientsMenuHeader.setMenu(ClientsMenu);
		shell.pack();
		
		Label lblPolicyNo = new Label(shell, SWT.NONE);
		lblPolicyNo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPolicyNo.setText("Policy No:");
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblDate = new Label(shell, SWT.NONE);
		lblDate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDate.setText("Date:");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		DateTime dateTime = new DateTime(shell, SWT.BORDER);
		new Label(shell, SWT.NONE);
		
		Label lblAmount = new Label(shell, SWT.NONE);
		lblAmount.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAmount.setText("Amount:");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblAmountPaid = new Label(shell, SWT.NONE);
		lblAmountPaid.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAmountPaid.setText("Amount Paid:");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblStatus = new Label(shell, SWT.NONE);
		lblStatus.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblStatus.setText("Status:");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblFullfillmentDate = new Label(shell, SWT.NONE);
		lblFullfillmentDate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFullfillmentDate.setText("Fullfillment Date:");
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnCreate = new Button(shell, SWT.NONE);
		btnCreate.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnCreate.setText("CREATE");
		
		Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnCancel.setText("CANCEL");
		
				
		shell.open();

		shell.setMenuBar(menuBar);
	   		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		
	}
	
	

	public Shell getShell() {
		return shell;
	}
}
