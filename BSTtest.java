import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class BSTtest {

	public static void main(String[] args) throws IOException, Exception {
		BST<String, String> bst = new BST<String, String>();
		String line = null;
		String[] tmpLine;
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("capitals.txt"), "UTF-8"));
		while((line = in.readLine()) != null){
			tmpLine = line.split(",");
			bst.insert(tmpLine[0], tmpLine[1]);
		}
		
		
		
		
		printAll(bst);
		print();
	}
	
	

	 static void print() {
			System.out.println("┌────┐ "+"┌────┐ "+"┌────┐ "+"┌───┐ "+"┌───┐ "+"┌────┐ "+"┌─┐    "+"┌───┐");
			System.out.println("│ ┌──┘ "+"│ ┌┐ │ "+"│ ┌┐ │ "+"└┐ ┌┘ "+"└┐ ┌┘ "+"│ ┌┐ │ "+"│ │    "+"│ ┌─┘");
			System.out.println("│ │    "+"│ └┘ │ "+"│ └┘ │ "+" │ │  "+" │ │  "+"│ └┘ │ "+"│ │    "+"│ └─┐");
			System.out.println("│ │    "+"│ ┌┐ │ "+"│ ┌──┘ "+" │ │  "+" │ │  "+"│ ┌┐ │ "+"│ │    "+"└─┐ │");
			System.out.println("│ └──┐ "+"│ ││ │ "+"│ │    "+"┌┘ └┐ "+" │ │  "+"│ ││ │ "+"│ └──┐ "+"┌─┘ │");
			System.out.println("└────┘ "+"└─┘└─┘ "+"└─┘    "+"└───┘ "+" └─┘  "+"└─┘└─┘ "+"└────┘ "+"└───┘");
		
	}

	 static void printAll(BST<String, String> bst){
		 for(String s: bst.leverOrder()){
			System.out.println("나라 : " + s + " 수도 :  " + bst.search(s));	
		} 
		 
	 }



}
