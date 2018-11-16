package whi;

public class Star {

	public static void main(String[] args) {
		 System.out.println("**************************************");
		 System.out.println("**************************************");
//		for (int i = 1; i < 8; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print("Q");
//			}
//			// System.out.println();
//		}
		
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				//System.out.print("\t");
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
            	 
                System.out.print("*");
            }
           
            System.out.println();
        }
//		  for (int i = 1; i <= n; i++) 
//	        {
//	            for (int j = 1; j < i; j++) 
//	            {
//	               // System.out.print("\t ");
//	            }
//	             
//	            for (int k = i; k <= n; k++) 
//	            	
//	            { 
//	                System.out.print("*"); 
//	            } 
//	          
//	            System.out.println(""); 
//	        } 
	      
			 System.out.println("************************************");
			//System.out.println("");
		}
				}
	//}
