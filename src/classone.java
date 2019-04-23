
public class classone {
 
    
  
  public String pname;
    public String pfor;
      public String pservicel;
        public String pservicet;
            public String powner;
              public int pcontact;
               public String pemail;
                  public String username;
                     public String password;
                     private byte[] picture;
  

    public classone(String pname, String pfor,String pservicel,String pservicet, String powner, int pcontact, String pemail,String username,String password, byte[] image)
    {
  this.pname =pname;
  this.pfor=pfor;
  this.pservicel=pservicel;
  this.pservicet= pservicet;
      this.powner=powner;
          this.pcontact=pcontact;
          this.pemail=pemail;
          this.username= username;
          this.password=password;
          this.picture=image;
    }
    

    public String getPname()
    {
        return pname;
    }
    
      public String getPfor()
    {
        return pfor;
    }
        public String getPservicel()
    {
        return pservicel;
    }
        
         public String getPservicet()
    {
        return pservicet;
    }
           public String getPowner()
    {
        return powner;
    }
             public int getPcontact()
    {
        return pcontact;
    }
      public String getPemail()
         {
           return pemail;
         }
               
       public String getUsername()
         {
           return username;
         }
     public String getPassword()
    {
        return password;
    }
     public byte[] getImage()
    {
        return picture;
    }
}