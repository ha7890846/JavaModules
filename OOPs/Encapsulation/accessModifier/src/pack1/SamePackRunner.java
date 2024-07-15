package pack1;

public class SamePackRunner {
    public static void main(String[] args) {
        PublicPack1 public_obj = new PublicPack1();
        public_obj.publicMsg();
        DefaultPack1 default_obj = new DefaultPack1();
        default_obj.defaultMsg();
        PrivatePack1 pvt_obj = new PrivatePack1();
        System.out.println("Pvt method is not accesible into same package,same class,not into other package too.");
        /*below code is throw error due to being private method. 
        pvt_obj.privateMsg();
        */        
        ProtectedPack1 prot_obj = new ProtectedPack1();
        prot_obj.protectedMsg();
    }
}
