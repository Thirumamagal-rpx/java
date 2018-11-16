import java.awt.Composite;
import java.awt.GridLayout;
import java.sql.Date;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class claim {

	protected static final Object click = null;
	protected Shell shell;
	private Text textPolicyno;
	private Text text_1;
	private Text text_2;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_3;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			claim window = new claim();
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
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @return 
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(534, 442);
		shell.setLayout(null);
		
		Label lblPolicyNo = new Label(shell, SWT.NONE);
		lblPolicyNo.setAlignment(SWT.RIGHT);
		lblPolicyNo.setBounds(10, 29, 98, 15);
		lblPolicyNo.setText("POLICY NO  :");
		
		textPolicyno = new Text(shell, SWT.BORDER);
		textPolicyno.setBounds(114, 26, 301, 21);
		
		Button btnSearch = new Button(shell, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			
			
			public void widgetSelected(SelectionEvent e) {
			if(e.getSource()==click) {
				lblPolicyNo.setText("The policy number is"+textPolicyno);
			}
			}
		});
		btnSearch.setBounds(421, 24, 75, 25);
		btnSearch.setText("SEARCH");
		
		Group group = new Group(shell, SWT.NONE);
    	group.setBounds(20, 67, 498, 156);
		
		Label lblFirstName = new Label(group, SWT.NONE);
		lblFirstName.setAlignment(SWT.RIGHT);
		lblFirstName.setBounds(29, 31, 66, 15);
		lblFirstName.setText("FirstName  :");
		
		text_1 = new Text(group, SWT.BORDER);
		text_1.setBounds(101, 28, 136, 21);
		
		Label lblLastName = new Label(group, SWT.NONE);
		lblLastName.setAlignment(SWT.RIGHT);
		lblLastName.setBounds(29, 64, 66, 15);
		lblLastName.setText("Last Name  :");
		
		text_2 = new Text(group, SWT.BORDER);
		text_2.setBounds(101, 61, 136, 21);
		
		Label lblNewLabel_3 = new Label(group, SWT.NONE);
		lblNewLabel_3.setAlignment(SWT.RIGHT);
		lblNewLabel_3.setBounds(29, 97, 66, 15);
		lblNewLabel_3.setText("DOB :");
		
		Label lblNewLabel_4 = new Label(group, SWT.NONE);
		lblNewLabel_4.setBounds(10, 128, 85, 15);
		lblNewLabel_4.setText("Phone Number:");
		
		text_4 = new Text(group, SWT.BORDER);
		text_4.setBounds(101, 125, 136, 21);
		
		Label lblNewLabel_5 = new Label(group, SWT.NONE);
		lblNewLabel_5.setAlignment(SWT.RIGHT);
		lblNewLabel_5.setBounds(265, 50, 81, 15);
		lblNewLabel_5.setText("E-mail ID :");
		
		text_5 = new Text(group, SWT.BORDER);
		text_5.setBounds(352, 50, 136, 21);
		
		Label lblNewLabel_6 = new Label(group, SWT.NONE);
		lblNewLabel_6.setAlignment(SWT.RIGHT);
		lblNewLabel_6.setBounds(265, 88, 81, 15);
		lblNewLabel_6.setText("Address :");
		
		text_6 = new Text(group, SWT.BORDER);
		text_6.setBounds(352, 77, 136, 74);
		
//		final DateTime dateTime = new DateTime(group, SWT.CALENDAR | SWT.SHORT);
//	Time.setBounds(101, 79, 136, 24);]\]\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\		final DateTime calendar = new DateTime (shell, SWT.CALENDAR | SWT.DROP_DOWN);
//	      final DateTime date = new DateTime (shell, SWT.DATE | SWT.SHORT);
//	      final DateTime time = new DateTime (shell, SWT.TIME | SWT.SHORT);
	
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		
		
//		 final DateTime timeWidget = new DateTime(timeWidget, SWT.TIME | SWT.DROP_DOWN);
//		  timeWidget.setHours(Date.Defaults.HOURS);
//		  timeWidget.setMinutes(Dates.Defaults.MINUTES);
//		  timeWidget.setSeconds(Dates.Defaults.SECONDS);
//		  return timeWidget;
		
		Label lblTypeOfPolicy = new Label(group, SWT.NONE);
		lblTypeOfPolicy.setAlignment(SWT.RIGHT);
		lblTypeOfPolicy.setBounds(265, 26, 81, 15);
		lblTypeOfPolicy.setText("Type of Policy :");
		
		Combo combo = new Combo(group, SWT.NONE);
		combo.setBounds(352, 23, 136, 23);
		
		Label lblPolicyNumber = new Label(group, SWT.NONE);
		lblPolicyNumber.setAlignment(SWT.RIGHT);
		lblPolicyNumber.setBounds(10, 10, 85, 15);
		lblPolicyNumber.setText("Policy Number");
		
		Label lblpolicy = new Label(group, SWT.NONE);
		lblpolicy.setBounds(119, 10, 55, 15);
		lblpolicy.setText("New Label");
		
		DateTime dateTime = new DateTime(group, SWT.CALENDAR);
		dateTime.setBounds(101, 88, 136, 24);
				
		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setBounds(10, 241, 498, 135);
		
		Label lblNewLabel_7 = new Label(group_1, SWT.NONE);
		lblNewLabel_7.setAlignment(SWT.RIGHT);
		lblNewLabel_7.setBounds(10, 10, 94, 15);
		lblNewLabel_7.setText("Name Of Patient :");
		
		text_3 = new Text(group_1, SWT.BORDER);
		text_3.setBounds(104, 7, 138, 21);
		
		Label lblNewLabel_8 = new Label(group_1, SWT.NONE);
		lblNewLabel_8.setAlignment(SWT.RIGHT);
		lblNewLabel_8.setBounds(16, 51, 88, 15);
		lblNewLabel_8.setText("Amount Paid :");
		
		text_7 = new Text(group_1, SWT.BORDER);
		text_7.setBounds(104, 48, 138, 21);
		
		Label lblNewLabel_9 = new Label(group_1, SWT.NONE);
		lblNewLabel_9.setAlignment(SWT.RIGHT);
		lblNewLabel_9.setBounds(10, 96, 94, 15);
		lblNewLabel_9.setText("Date Of Expense :");
		
		text_8 = new Text(group_1, SWT.BORDER);
		text_8.setBounds(104, 96, 138, 21);
		
		Label lblNewLabel_10 = new Label(group_1, SWT.NONE);
		lblNewLabel_10.setAlignment(SWT.RIGHT);
		lblNewLabel_10.setBounds(248, 10, 102, 15);
		lblNewLabel_10.setText("No. Of Receipt :");
		
		text_9 = new Text(group_1, SWT.BORDER);
		text_9.setBounds(364, 10, 124, 21);
		
		Label lblNewLabel_11 = new Label(group_1, SWT.NONE);
		lblNewLabel_11.setAlignment(SWT.RIGHT);
		lblNewLabel_11.setBounds(248, 51, 110, 15);
		lblNewLabel_11.setText("Claimable Amount :");
		
		text_10 = new Text(group_1, SWT.BORDER);
		text_10.setBounds(364, 51, 124, 21);
		
		Button btnNewButton_1 = new Button(group_1, SWT.NONE);
		btnNewButton_1.setBounds(251, 91, 75, 25);
		btnNewButton_1.setText("Cancel");
		
		Button btnNewButton_2 = new Button(group_1, SWT.NONE);
		btnNewButton_2.setBounds(332, 91, 75, 25);
		btnNewButton_2.setText("Clear");
		
		Button btnNewButton_3 = new Button(group_1, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_3.setBounds(413, 91, 75, 25);
		btnNewButton_3.setText("Create ");
		
		Label lblNewLabel_12 = new Label(shell, SWT.NONE);
		lblNewLabel_12.setBounds(228, 382, 55, 15);
		lblNewLabel_12.setText("CLAIM ID :");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(289, 382, 207, 21);

	}
}
