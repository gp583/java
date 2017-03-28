import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KastDriver {
	public static void main(String[] args) {
		KastDriver invoice = new KastDriver();
		Scanner kb = new Scanner(System.in);
		ArrayList<Container> loads = new ArrayList<Container>();
		int i;
		Scanner myFile;
		String fileName = "kast.txt";
		boolean notFound = true;
		String temp = "";

		String junk;
		int wrongCount = 0;

		while (notFound) {
			try {
				myFile = new Scanner(new File(fileName));
				temp = myFile.nextLine();
				int num = Integer.parseInt(temp);
				System.out.println(num);
				// notFound = false;
				// st = new StringTokenizer(temp, " ");
				for (i = 0; i < num; i++) {
					temp = myFile.nextLine();
					// System.out.println("TEMP: " + temp);
					StringTokenizer st = new StringTokenizer(temp, "\t\t");

					String date = st.nextToken();
					System.out.println("Date: " + date);
					int ticketNo = Integer.parseInt(st.nextToken());
					System.out.println("ticketNo: " + ticketNo);
					int size = Integer.parseInt(st.nextToken());
					System.out.println("size: " + size);
					loads.add(new Container(date, ticketNo, size));
				}
				notFound = false;
				myFile.close();
			} catch (FileNotFoundException e) {
				System.out.println("Incorrect file, please re-enter");
				wrongCount++;
				fileName = kb.nextLine();
				if (wrongCount == 3)
					break;
			}
		}

		for (i = 0; i < loads.size(); i++) {
			System.out.println(loads.get(i));
		}
	}
}
