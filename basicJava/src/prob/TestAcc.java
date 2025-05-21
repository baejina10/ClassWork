package prob;

public class TestAcc {
    public static void main(String[] args) throws Exception {
        String accNo = null;
        int balance = 0;
      //[TestAccount 실행결과] 
        Account accObj = new Account();
      //078-3762-293 계좌가 개설되었습니다. 
		accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo(); //변수 accNo에 계좌번호를 리턴받아 넣은 코드
        
      //078-3762-293 계좌의 잔고는 0만원입니다. 
        balance = accObj.getBalance(); //현재 잔고의 값을 리턴받는 코드
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
      
       //078-3762-293 계좌의 잔고는 100만원입니다. 
        accObj.save(100);
        balance = accObj.getBalance(); //현재 잔고의 값을 리턴받는 코드
        System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");
       //078-3762-293 계좌에 30만원이 출금되었습니다. 
        accObj.deposite(30);
      //078-3762-293 계좌의 잔고는 70만원입니다. 
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }
}
