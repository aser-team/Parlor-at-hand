package parlor2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ServiceClass {
       
private int pid;
private String sname;
private int sid;
private String sprice;
private String sdescription;
        public ServiceClass(int pid,String sname,int sid,String sprice,String sdescription)
        {
            this.sname=sname;
            this.sprice=sprice;
            this.sdescription=sdescription;
            this.pid=pid;
            this.pid=pid;
        }
         public ServiceClass(String sname, String sprice)
         {
                 this.sname=sname;
            this.sprice=sprice;
         }
        
        public int getpid(){
            return this.pid;
        }
        public String getsname()
        {
            return this.sname;
        }
          public int getsid()
        {
            return this.sid;
        }
        public String getsprice()
        {
            return this.sprice;
        }
        public String getsdescription()
        {
            return this.sdescription;
        }
}
