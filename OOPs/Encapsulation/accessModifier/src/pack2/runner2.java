package pack2;
import pack1.*;
public class runner2 {
    public static void main(String[] args) {
        System.out.println("Runner of Pack 2.....");
        PublicPack1 obj = new PublicPack1();
        obj.publicMsg();
        System.out.println("default class is not accesible into other package.");
        /* Default method throw Error...
        
        // Create instance obj for default class from pack1 is invailid.
        
        DefaultPack1 default_obj = new DefaultPack1();
        default_obj.defaultMsg();
        */
        
        // private instance creation..
        PrivatePack1 pvt_obj = new PrivatePack1();
        System.out.println("pvt method is not accesible into other package.");
        /*below code is throw error due to being private method. 
        pvt_obj.privateMsg();
        */
        ProtectedPack1 prot_obj = new ProtectedPack1();
        System.out.println("protected method is not accesible into other package.");
        System.out.println("Untill this class does not get extends from ProtectedPack1.");
        /* pvt method is not accesible here. 
         prot_obj.protectedMsg();
        */
        
    }
}
