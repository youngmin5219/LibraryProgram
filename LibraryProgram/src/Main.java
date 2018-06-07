import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	//도서검색 함수
	public void findSystem(String findname, ArrayList<Book> bookList) {//findname = 검색어
		//비교하기 쉽도록 책이름을 소문자로 변환, 공백제거
		ArrayList<String> bookname = new ArrayList<String>();//전부소문자이고 공백없는 책이름
		for(int i=1; i<201; i++) {
			String name;
			name = bookList.get(i).title.toLowerCase();//전부 소문자로
			name = name.trim();//공백제거
			bookname.add(name);
		}
		//

		findname = findname.toLowerCase();//소문자로
		String[] target = findname.split(" ");//검색어를 띄어쓰기로 구분
		int[] bookcheck = new int[201];// 이미 해당하는 검색어가 있어 출력된 책은 1, 아닌 책은 0

		//전체 검색어에 대한 검색 결과
		findname = findname.trim();//공백제거
		for(int i=1; i<201; i++) {
			String book = bookname.get(i);
			if(book.contains(findname) && bookcheck[i]==0) {//검색어가 책 이름에 포함된 경우
				bookcheck[i]=1;
				//gui로 bookobj.get(i)를 출력
			}
		}
		//

		//띄어쓰기로 구분한 검색어에 대한 결과
		for(int i=0; i<target.length; i++) {
			for(int j=1; j<201; j++) {
				String book = bookname.get(j);
				if(book.contains(target[i]) && bookcheck[j]==0) {//검색어가 책 이름에 포함된 경우
					bookcheck[j]=1;
					//gui로 bookobj.get(i)를 출력
				}
			}
		}
	}
	//

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader reading = new Reader();
		ArrayList<Book> bookobj = new ArrayList<Book>();
		bookobj = reading.read();
		for(int i=1; i<201; i++){
			System.out.println(bookobj.get(i).title+bookobj.get(i).author+bookobj.get(i).publisher+bookobj.get(i).location);
		}
	}
}
