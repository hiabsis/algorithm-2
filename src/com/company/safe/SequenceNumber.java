package com.company.safe;

public class SequenceNumber {
    public static ThreadLocal<Integer> seqNumber = new ThreadLocal<>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    public  int getNextNum(){
        seqNumber.set(seqNumber.get()+1);
        return seqNumber.get();
    }

    public static void main(String[] args) {
        SequenceNumber sequenceNumber = new SequenceNumber();
        TestClient client1 = new TestClient(sequenceNumber);
        TestClient client2 = new TestClient(sequenceNumber);
        TestClient client3 = new TestClient(sequenceNumber);
        client1.start();
        client2.start();
        client3.start();
    }
    private static  class  TestClient extends  Thread{
        private SequenceNumber sn;
        public TestClient(SequenceNumber sn){
            this.sn = sn;
        }

        @Override
        public void run() {
            for (int i =0;i<3;i++){
                System.out.println("thread ["+Thread.currentThread().getName()+"] sn["+sn.getNextNum()+"]");
            }
        }
    }

}
