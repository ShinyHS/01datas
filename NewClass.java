/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package hello.datastore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import org.springframework.ui.Model;  
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import java.util.ArrayList;


/**
 *
 * @author Guest01
 */
@Controller
public class NewClass {
    //public ArrayList<String> namearr = new ArrayList<String>();
    int editx;
    public  ArrayList<Integer> agearr;
    @RequestMapping("/data")
    public  String display(HttpServletRequest req,Model m) throws IOException
    {
        String  i=req.getParameter("t1");
        String  j=req.getParameter("t2");
        int k=Integer.parseInt(req.getParameter("t3"));
        String  l=req.getParameter("t4"); 
        //ModelAndView mv=new ModelAndView();
        m.addAttribute("result",i);
        //mv.addObject("result",x);
        m.addAttribute("city",j);
        m.addAttribute("age",k);
      m.addAttribute("salary",l);
//------------------------------
     Connection c = null;
     Statement stmt = null;
    try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ShaTest","postgres","root");
          stmt = c.createStatement();
           System.out.println("----------try inside-------");
             ResultSet rs = stmt.executeQuery( "SELECT * FROM Student;" );
             int flag=1;
            while ( rs.next() ) {
            int age1 = rs.getInt("ID");
            if(age1==k)
            {
                flag=10;
            }
            
         }
         if(flag==10)
         return "wrongpage";
        String sql="INSERT INTO Student (NAME,CITY,ID,SALARY) "
            + "VALUES ('"+i+"','"+j+"','"+k+"','"+l+"')";
            stmt.executeUpdate(sql);
      } catch (Exception e) {       
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
        return "save";
    } 
//---------------------------------  
      @RequestMapping("/view")
      public String views(Model m)
      {
     Connection c = null;
     Statement stmt = null;
    try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ShaTest","postgres","root");
          stmt = c.createStatement();
          System.out.println("----------try inside-------");
          ResultSet rs = stmt.executeQuery( "SELECT * FROM Student;" );
          //String namearr[] =new String[10];
          ArrayList<String> namearr = new ArrayList<String>();
          //int agearr[] =new int[10];
           agearr = new ArrayList<Integer>();
          //String addressarr[] =new String[10];
           ArrayList<String> addressarr = new ArrayList<String>();
          //float salaryarr[] =new float[10];
           ArrayList<Double> salaryarr = new ArrayList<Double>();
          int i=0,j=0;
            while ( rs.next() ) {
            String  name = rs.getString("name");
            int age  = rs.getInt("ID");
            String  address = rs.getString("city");
            double salary = rs.getInt("salary");
            //namearr[i]=name;
            namearr.add(name);
            //agearr[i]=age;
             agearr.add(age);
            //addressarr[i]=address;
            addressarr.add(address);
            //salaryarr[i]=salary;
            salaryarr.add(salary);
             m.addAttribute("namearr",namearr);
             m.addAttribute("agearr",agearr);
             m.addAttribute("addressarr",addressarr);
             m.addAttribute("salaryarr",salaryarr);
//             arr[i][0]=name;
//             //arr[i][1]=ag;
//             arr[i][1]=address;
//             //arr[i][2]=salary;
              i++;
//              m.addAttribute("array",arr);
//            System.out.println( "NAME = " + name );
//            System.out.println( "AGE = " + age );
//            System.out.println( "ADDRESS = " + address );
//            System.out.println( "SALARY = " + salary );
//            System.out.println();
         }
      } catch (Exception e) {       
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      return "dbview";
      }
       @RequestMapping("/delete")
       public String del()
       {
            return "del";
        }
       @RequestMapping("/dbdel")
       public String del2(HttpServletRequest req,Model m)
       {
            int dx=Integer.parseInt(req.getParameter("delname"));
            System.out.println("delete name is"+dx);
            
            //-----------
            Connection c = null;
            Statement stmt = null;

            int flag=1;
          try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ShaTest","postgres","root");
          stmt = c.createStatement();
          System.out.println("----------try inside-------");
          ResultSet rs = stmt.executeQuery( "SELECT * FROM Student;" );
            while ( rs.next() ) {
            int  name1 = rs.getInt("ID");
            if(name1==dx)
            {
                flag=10;
            }
             System.out.println("name " +name1);     
         }
         if(flag==1)
         return "wrongpage";
            String sql= "DELETE FROM student WHERE ID='"+dx+"';";
            stmt.executeUpdate(sql);
            
      } catch (Exception e) {       
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
          return "wrongpage";
         //System.exit(0);
        
      }
      System.out.println("Open delete page DB successfully");
           
           return"deletepage";
        }
         @RequestMapping("/edit")
         public String edit()
         {
            return "editpage";
        }
        @RequestMapping("/edits")
        public String edits(HttpServletRequest req,Model m)
         {
              //String e1=req.getParameter("e1");
              String e2=req.getParameter("e2");
              String e3=req.getParameter("e3");
              int e4=Integer.parseInt(req.getParameter("e4"));
              String e5=req.getParameter("e5");
                Connection c = null;
                Statement stmt = null;
          try { 
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ShaTest","postgres","root");
          stmt = c.createStatement();
          System.out.println("----------try inside-------");
              ResultSet rs = stmt.executeQuery( "SELECT * FROM Student;" );
             int flag=1;
            while ( rs.next() ) {
            int age1 = rs.getInt("ID");
            if(age1==e4)
            {
                flag=10;
            }
         }
         int f=agearr.get(editx-1);
         if(e4==f)
         flag=9;
         if(flag==10)
         return "wrongpage";
               int l=agearr.size();
                for(int i=0;i<l;i++)
                {
                     
                    if(i==editx-1)
                    {
                        System.out.println("list ans "+agearr.get(i) );
                        int dq=agearr.get(i);
                        //String sql="DELETE FROM student WHERE ID='"+dq+"';";
                        //stmt.executeUpdate(sql);
                         //stmt.executeUpdate(sql);
                         String sql="UPDATE STUDENT SET name ='"+e2+"',city='"+e3+"',ID='"+e4+"',salary='"+e5+"' where id='"+dq+"';";
                         stmt.executeUpdate(sql);
                    }   
                }
          
 } catch (Exception e) {       
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }  
            System.out.println("Open edit page DB successfully ");
              return "deletepage";
         }
         @RequestMapping("/search")
         public String searchs()
         {
            return "search";
         }
         @RequestMapping("/sear")
         public String sear(HttpServletRequest req,Model m)
         {
            int s1=Integer.parseInt(req.getParameter("s1"));;
              Connection c = null;
            Statement stmt = null;

         int flag=1;
          try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ShaTest","postgres","root");
          stmt = c.createStatement();
          System.out.println("----------try inside-------");
          ResultSet rs = stmt.executeQuery( "SELECT * FROM Student;" );
            while ( rs.next() ) {
            int  name1 = rs.getInt("ID");
            if(name1==s1)
            {
                flag=10;
            }
             System.out.println("name " +name1);
         }
         if(flag==1)
         return "wrongpage";
         ResultSet rs1=stmt.executeQuery("select * from student where ID='"+s1+"';");
         rs1.next();
         String sn=rs1.getString("name");
         int sa  = rs1.getInt("ID");
         String  sad = rs1.getString("city");
         double ss = rs1.getInt("salary");
             m.addAttribute("s1",sn);
             m.addAttribute("s2",sa);
             m.addAttribute("s3",sad);
             m.addAttribute("s4",ss);
        }catch (Exception e) {       
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
             }  
            return "viewserch";
         }
         @RequestMapping("/xyzz")
         public String delrow(HttpServletRequest req) 
         {
                      Connection c = null;
                      int x= Integer.parseInt(req.getParameter("xyz"));
                      Statement stmt = null;
             try { 
               Class.forName("org.postgresql.Driver");
               c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ShaTest","postgres","root");
                stmt = c.createStatement();
                System.out.println("----------try inside-------");
                int l=agearr.size();
                for(int i=0;i<l;i++)
                {
                    if(i==x-1)
                    {
                        System.out.println("list ans "+agearr.get(i) );
                        int dq=agearr.get(i);
                        String sql="DELETE FROM student WHERE ID='"+dq+"';";
                        stmt.executeUpdate(sql);
                    }   
                }
            } catch (Exception e) {       
                    e.printStackTrace();
                    System.err.println(e.getClass().getName()+": "+e.getMessage());
                    System.exit(0);
                 }  
            System.out.println("value is "+x );
             return "dellrows";
         }
         @RequestMapping("/xyzzz")
         public String editrow(HttpServletRequest req)
         {
                editx= Integer.parseInt(req.getParameter("xyz"));
                System.out.println("edit "+editx);
                return "editpage";
          }
}
