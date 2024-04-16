
package projecet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Person {
    static final String rootPath = "C:/eclipse/PhoneDB.txt";

    public static void main(String[] args) {
        List<Personinfo> person = new ArrayList<>();
        run(person);
    }

    private static void run(List<Personinfo> person) {
        boolean run = true;
        System.out.println("***************");
        System.out.println("전화번호 관리 프로그램");
        System.out.println("***************");
        while (run) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
            System.out.println("-------------------------");
            System.out.println(">메뉴번호:");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("<1.리스트>");
                    readTxt(person);
                    break;
                case 2:
                    System.out.println("<2.등록>");
                    putTxt(sc,person);
                    break;
                case 3:
                    System.out.println("<3.삭제>");
                    deleteTxt(sc,person);
                    break;
                    
                case 4:
                    System.out.println("<4.검색>");
                    searchTxt(sc,person);
                    break;
                    
                case 5:
                    System.out.println("프로그램을 종료합니다");
                    sc.close();
                    run = false;
                    break;
                default:
                    System.out.println("[다시 입력해주세요]");
                    break;
            }
        }
    }

    private static void readTxt(List<Personinfo> person) {
    	try {
			BufferedReader br = new BufferedReader(new FileReader(rootPath));
			String phoneList;
			
			int index =1;
			
			while((phoneList = br.readLine())!= null) {
				System.out.println(index);
				StringTokenizer st = new StringTokenizer(phoneList,"\t");
				System.out.println(st.nextToken());
				index ++;
			
			}
			br.close();
		
		}catch(IOException e) { 
			e.printStackTrace();
			System.exit(1);
        }
    }
    private static void putTxt(Scanner sc,List<Personinfo> person) {
    	System.out.println("이름:");
    	String name = sc.next();
    	System.out.println("휴대전화:");
    	String hp = sc.next();
    	System.out.println("번호:");
    	int num = sc.nextInt();
    	person.add(new Personinfo(name , hp ,num));
    	updateTxt(person);
    	System.out.println("등록 되었습니다");
    	}
    
    private static void updateTxt(List<Personinfo> person) {
    	 try (BufferedWriter writer = new BufferedWriter(new FileWriter(rootPath,true))) {
    	        for (Personinfo p : person) {
    	            writer.write(p.getName() + "," + p.getHp() + "," + p.getNum());
    	            writer.newLine(); 
    	        }
    	        System.out.println("파일이 업데이트되었습니다.");
    	    } catch (IOException e) {
    	        System.out.println("파일 업데이트 중 오류가 발생했습니다.");
    	        e.printStackTrace();
    	    }
    	}
    
    
    private static void deleteTxt(Scanner sc,List<Personinfo> person) {

    	try {
            File inputFile = new File(rootPath);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            System.out.println("삭제할 이름을 입력하세요:");
            String del = sc.next();

            String delline;
            boolean found = false;

            while ((delline = reader.readLine()) != null) {
                String[] tokens = delline.split(",");
                if (!tokens[0].equals(del)) {
                    writer.write(delline + System.getProperty("line.separator"));
                } else {
                    found = true;
                }
            }

            reader.close();
            writer.close();

            if (inputFile.delete()) {
                if (!tempFile.renameTo(inputFile)) {
                    System.out.println("파일을 대체하는 데 문제가 발생했습니다.");
                }
            } else {
                System.out.println("기존 파일을 삭제하는 데 문제가 발생했습니다.");
            }

            if (found) {
                System.out.println("삭제되었습니다.");
            } else {
                System.out.println("해당 이름을 찾을 수 없습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void searchTxt(Scanner sc ,List<Personinfo> person) {
    	
    	try {
            BufferedReader br = new BufferedReader(new FileReader(rootPath));
            System.out.println("검색할 문자열을 입력하세요:");
            String search = sc.next();
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                for (String token : tokens) {
                    if (token.contains(search)) {
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }
            }

            br.close();
            if (!found) {
                System.out.println("검색 결과가 없습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
    
        }
    }
    }    	
	

