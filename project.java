///////////////////////////////public function to add number of months to system
public void addMonths(Date date, int numMonths)
{
    date.setMonth((date.getMonth() - 1 + numMonths) % 12 + 1);
}

public void addYears(Date date, int numYears)
{
    date.setYear((date.getYear() + numYears));
}
int globofid=0;
int globcus=0;
int globk=0;
/////////////////////////////////////////////////////policy class
////////////////////////////////////////////////////////////////////////////

abstract class policy
{
	private int cid;
//	private int famid[];
	private long cover;
	private String type;
	private int polnum;
	private int num_of_years;
	private Date next_prem_date,start_date,expiry_date;
	private long prem_amt,tot_prem;
	abstract int getcid();
	abstract String getpolnum();
	abstract int getnum_of_years();
	abstract Date getnpd();
	abstract Date getsd();
	abstract Date geted();
	abstract long gettp();
	abstract long getcov();
//	abstract int[] getfamid();
	abstract String gettype();
	abstract void calc_totprem();
	abstract long getpremamt();
    //abstract void setpolnum(int);
	abstract void setnum_of_years(int);
	abstract void setnpd(Date);
	abstract void setcov(long);
	abstract void setsd(Date);
	abstract void seted(Date);
	abstract void setpremamt(long);
	abstract void payprem();
//	abstract void setfamid(int);
	abstract void show();
	abstract void claim(long);
}
class individualpol extends policy
{
	String type;
	individualpol()
	{
		type="individual";
		polnum=globk++;
	}
/*	void setfamid(int a[])
	{
		;
	}
	int[] getfamid()
	{
		;
	}
*/	long getcov()
	{
		return cover;
	}
	String gettype()
	{
		return type;
	}
	long gettp()
	{
		return (tot_prem);
	}
	void calc_totprem()
	{
		tot_prem=num_of_years*prem_amt;
	}
    int getcid()
    {
    	return cid;
    }
	int getpolnum()
	{
		return polnum;
	}
	int getnum_of_years()
	{
		return num_of_years;
	}
	Date getnpd()
	{
		return next_prem_date;
	}
	Date getsd()
	{
		return start_date;
	}
	Date geted()
	{
		return expiry_date;
	}
	long getpremamt()
	{
		return prem_amt;
	}
	void setcov(long c)
	{
		cover=c;
	}
	void setnum_of_years(int n)
	{
		num_of_years=n;
	}
	void setnpd(Date d)
	{
		next_prem_date=d;
	} 
	void setsd(Date d)
	{
		start_date=d;
	}
	void seted(Date d)
	{
		expiry_date=d;
	}
	void setpremamt(long p)
	{
		prem_amt=p;
	}
	void payprem()
	{
		tot_prem=tot_prem-prem_amt;
		//add 1 month to next prem date after checking ki kahi expiry se zyada na ho jae vo....
	}
	void show()
	{
		System.out.println ("............................................................................................");
		System.out.println (".......................................POLICY DETAILS........................................");
		System.out.println ("POLICY ID: " + polnum);
		System.out.println ("TYPE :" + type);
		System.out.println ("COMPANY ID " + cid);
		System.out.println ("NUMBER OF YEARS : " +num_of_years);
		System.out.println ("START DATE : " + start_date);
		System.out.println ("EXPIRY DATE : " + expiry_date);
		System.out.println ("DATE FOR NEXT PREMIUM PAYMENT : " +next_prem_date);
		System.out.println ("MONTHLY PREMIUM : " + prem_amt);
		System.out.println ("TOTAL PREMIUM TO BE PAID : " + tot_prem);	
		System.out.println ("COVER AMOUNT: " + cover);
	}
	void claim(long amt)
	{
		cover=cover-amt;
	}	
}
class employeepol extends policy
{
	String type;
	employeepol()
	{
		type="employee";
		polnum=globk++;
	}
/*	void setfamid(int a[])
	{
		;
	}
	int[] getfamid()
	{
		;
	}
*/	long getcov()
	{
		return cover;
	}
	String gettype()
	{
		return type;
	}
	long gettp()
	{
		return (tot_prem);
	}
	void calc_totprem()
	{
		tot_prem=num_of_years*prem_amt;
	}
    int getcid()
    {
    	return cid;
    }
	int getpolnum()
	{
		return polnum;
	}
	int getnum_of_years()
	{
		return num_of_years;
	}
	Date getnpd()
	{
		return next_prem_date;
	}
	Date getsd()
	{
		return start_date;
	}
	Date geted()
	{
		return expiry_date;
	}
	long getpremamt()
	{
		return prem_amt;
	}
	void setcov(long c)
	{
		cover=c;
	}
	void setnum_of_years(int n)
	{
		num_of_years=n;
	}
	void setnpd(Date d)
	{
		next_prem_date=d;
	} 
	void setsd(Date d)
	{
		start_date=d;
	}
	void seted(Date d)
	{
		expiry_date=d;
	}
	void setpremamt(long p)
	{
		prem_amt=p;
	}
	void payprem()
	{
		tot_prem=tot_prem-prem_amt;
		//add 1 month to next prem date after checking ki kahi expiry se zyada na ho jae vo....
	}
	void show()
	{
		System.out.println ("............................................................................................");
		System.out.println (".......................................POLICY DETAILS........................................");
		System.out.println ("POLICY ID: " + polnum);
		System.out.println ("TYPE :" + type);
		System.out.println (" COMPANY ID " + cid);
		System.out.println ("NUMBER OF YEARS : " +num_of_years);
		System.out.println ("START DATE : " + start_date);
		System.out.println ("EXPIRY DATE : " + expiry_date);
		System.out.println ("DATE FOR NEXT PREMIUM PAYMENT : " +next_prem_date);
		System.out.println ("MONTHLY PREMIUM : " + prem_amt);
		System.out.println ("TOTAL PREMIUM TO BE PAID : " + tot_prem);	
		System.out.println ("COVER AMOUNT: " + cover);
	}
	void claim(long amt)
	{
		cover=cover-amt;
	}	
}
class familypol extends policy
{
	String type;
	familypol()
	{
		polnum=globk++;
		type="family";
	}
/*	void setfamid(int a[])
	{
		famid=a;
	}
	int[] getfamid()
	{
		return famid;
	}
*/	long getcov()
	{
		return cover;
	}
	String gettype()
	{
		return type;
	}
	long gettp()
	{
		return (tot_prem);
	}
	void calc_totprem()
	{
		tot_prem=num_of_years*prem_amt;
	}
    int getcid()
    {
    	return cid;
    }
	int getpolnum()
	{
		return polnum;
	}
	int getnum_of_years()
	{
		return num_of_years;
	}
	Date getnpd()
	{
		return next_prem_date;
	}
	Date getsd()
	{
		return start_date;
	}
	Date geted()
	{
		return expiry_date;
	}
	long getpremamt()
	{
		return prem_amt;
	}
	void setcov(long c)
	{
		cover=c;
	}
	void setnum_of_years(int n)
	{
		num_of_years=n;
	}
	void setnpd(Date d)
	{
		next_prem_date=d;
	} 
	void setsd(Date d)
	{
		start_date=d;
	}
	void seted(Date d)
	{
		expiry_date=d;
	}
	void setpremamt(long p)
	{
		prem_amt=p;
	}
	void payprem()
	{
		tot_prem=tot_prem-prem_amt;
		//add 1 month to next prem date after checking ki kahi expiry se zyada na ho jae vo....
	}
	void show()
	{
		System.out.println ("............................................................................................");
		System.out.println (".......................................POLICY DETAILS........................................");
		System.out.println ("POLICY ID: " + polnum);
		System.out.println ("TYPE :" + type);
		System.out.println (" COMPANY ID " + cid);
/*		System.out.println (" FAMILY ID ");
		for(int i=0;i<famid.length;i++)
		{
			System.out.println (famid[i]);
		}
*/		System.out.println ("NUMBER OF YEARS : " +num_of_years);
		System.out.println ("START DATE : " + start_date);
		System.out.println ("EXPIRY DATE : " + expiry_date);
		System.out.println ("DATE FOR NEXT PREMIUM PAYMENT : " +next_prem_date);
		System.out.println ("MONTHLY PREMIUM : " + prem_amt);
		System.out.println ("TOTAL PREMIUM TO BE PAID : " + tot_prem);	
		System.out.println ("COVER AMOUNT: " + cover);
	}
	void claim(long amt)
	{
		cover=cover-amt;
	}	
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////class official
//////////////////////////////////////////////////////////////////////////////////////////////////////////



import java.io.*;
import java.util.*;
class official
{
	String type;
	int n;
	long cov;
	char ch;
	String sd,ed,npd;
	String offid;
	long p1,p2,p3;
	long prem;
	long pr1,pr2,pr3;
	official(String o,long p,long pp,long ppp,long pr,long prr,long prrr)
	{
		offid=o;
		p1=p;
		p2=pp;
		p3=ppp;
		pr1=pr;
		pr2=prr;
		pr3=prrr;
	}
	void paypremamt(policy p)
	{
		p.payprem();
	}
	String addp(customer c,policy pol[],customer c1[],int compid)
	{
		String s=null;
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");  
        sd = null;  
        ed = null;
        npd = null; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter type of policy you want");
		type=sc.nextLine();
		System.out.println("Enter the number of years you want the policy for");
		n=Integer.parseInt(sc.nextLine()); 
       // String date = "02/30/2012";
       	System.out.println("Enter the date you want the policy to begin from in dd/mm/yyyy format");
		sd=sc.readLine(); 
        try
        {  
            sd = df.parse(date);  
        } catch (ParseException e){ System.out.println("invalid format");}  
          
        if (!df.format(sd).equals(date)){  
            System.out.println("invalid date!!");  
        } else {  
            System.out.println("valid date");  
        }  
        ed=sd;
        npd=sd;
        addYears(ed,n);
        addMonths(npd,1);
		if(type.compToIgnoreCase("individual")==0)
		{
			cov=p1;
			prem=pr1;
		}
		else if(type.compToIgnoreCase("family")==0)
		{
			cov=p3;
			prem=pr3;
		}
		else if(type.compToIgnoreCase("employee")==0)
		{
			cov=p2;
			prem=pr2;
		}
		System.out.println("Cover that will be paid is " + (n*cov));
		System.out.println("Amount of premium per month is " + prem);	
		policy ob;
		s=type;
		if(type.compToIgnoreCase("individual")==0)
		{
			ob=new individualpol();
		}
		else if(type.compToIgnoreCase("family")==0)
		{
			ob=new familypol();
		}
		else if(type.compToIgnoreCase("employee")==0)
		{
			ob=new employeepol();
		}
		ob.setcid(compid);
		ob.setnum_of_years(n);
		ob.setnpd(npd);
		ob.setcov(cov*n);
		ob.setsd(sd);
		ob.seted(ed);
		ob.setpremamt(prem);
		pol[pol.length]=ob;
		c1[pol.length]=c;
		System.out.println("Record added");	
		return s;
	}
	void showdetail(policy p)
	{
		p.show();
	}
	void claims(policy p,long amt)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date date = new Date();
		if(p.getcov()>amt)
		{
			if((p.geted()).after(dateFormat.format(date)))
			{
				p.claim(amt);
			}
			else
			{
				System.out.println("Invalid request");		
			}
		}
		else
		{
			System.out.println("Invalid request");
		}
	}
	void checknremove(policy p[])
	{
		for(int i=0;i<p.length;i++)
		{
			DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			Date date = new Date();
			if(p[i].getcov()>0 && (p[i].geted()).after(dateFormat.format(date)))
			{
				;
			}
			else
			{
				for(int j=i;j<p.length-1;j++)
				{
					p[j]=p[j+1];
				}
				p[j]=null;
			}
		}
	} 
}




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////class customer //////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class familymem
{
	String name[];
	String add[];
	String dob[];
	int age[];
	long mob[];
	String ail[];
	String since[];
	String doc[];
	int i;
	familymem()
	{
		i=0;
	}
	void add()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name[i]=sc.nextLine();
		System.out.println("Enter address");
		add[i]=sc.nextLine();
		System.out.println("Enter dob");
		dob[i]=sc.nextLine();
		System.out.println("Enter age");
		age[i]=Integer.parseInt(sc.nextLine());
		System.out.println("Enter mob");
		mob[i]=Long.parseLong(sc.nextLine());
		i++;
	}
}


class customer
{
	policy taken[];
	company cmp[];
	int custid;
	String name;
	String address;
	String dob;
	int age;
	long mobnum;
	long salary;
	familymem fm;
	int ind;
	customer()
	{
		fm=new familymem();
		ind=0;
		fm=null;
		custid=globcus++;
	}
	void setcomp(company cm)
	{
		cmp[ind++]=cm;
	}
	void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter address");
		address=sc.nextLine();
		System.out.println("Enter dob");
		dob=sc.nextLine();
		System.out.println("Enter age");
		age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter mob");
		mobnum=Long.parseLong(sc.nextLine());
		System.out.println("Enter salary");
		salary=Long.parseLong(sc.nextLine());
	}
	void addfm()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		//fm=new familymem();
		System.out.println("how many family members do you want to add")
		n=Integer.parseInt(sc.readLine());
		for(int i=0;i<n;i++)
		{
			fm.add();
		}
	}
	void addpolicy(company c)
	{
		setcomp(c);
		cmp[ind-1].addcust(this);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//put to use template class ya to family members k basis pe search karu ya fir customer k basis pepolicy nikal lo....
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//supposing nikal gaya policy pole me;
		taken[ind-1]=search(c,c1);
	}
	void claim(company c,long amt)
	{
		int flag=0;
		for(int i=0;i<ind;i++)
		{
			if(cmp[i].getcid()==c.getcid())
			{
				cmp[i].claim(this,amt);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("no such policy from this company taken");
	}
	void payprem(company c)
	{
		int flag=0;
		for(int i=0;i<ind;i++)
		{
			if(cmp[i].getcid()==c.getcid())
			{
				cmp[i].paypremamtm(this);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("no such policy from this company taken");
	}
	void viewpoldet(company c)
	{
		int flag=0;
		for(int i=0;i<ind;i++)
		{
			if(cmp[i].getcid()==c.getcid())
			{
				cmp[i].showdetail(this);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("no such policy from this company taken");
	}
	familymem getfam()
	{
		return fm;
	}
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////// company class ////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class company
{
	private int cid;
	private String address;
	private String desc;
	private String pol1;
	private long pr1,pr2,pr3;
	private long cov1,cov2,cov3;
	private String pol2;
	private String pol3;
	private int ind;
	private official ob;
	private customer c[];
	private policy p[];
	private familymem fm[];
	company(int cid1,String add,String des,String pl1,String pl2,String pl3,long cv1,long cv2,long cv3,long p1,long p2,long p3)
	{
		ob=new official(globofid++,cov1,cov2,cov3,pr1,pr2,pr3);
		ind=0;
		cid=cid1;
		address=new String(add);
		desc=new String(des);
		pol1=new String(pl1);
		pol2=new String(pl2);
		pol3=new String(pl3);
		cov1=cv1;
		cov2=cv2;
		cov3=cv3;
		pol1=p1;
		pol2=p2;
		pol3=p3;
	}
	int getcid()
	{
		return cid;
	}
	void addcust(customer c1)
	{
		String s1;
		s1=ob.addp(c1,p,c,cid);
		if(s1==null)
		{
			System.out.println("not valid")
		}
		else
		{
			c[ind]=c1;
			if(s1=="family")
			{
				fm[ind]=c[ind].getfam();
			}
			else
				fm[ind]=null;
			ind++;
		}
	}
	void claim(customer c1,long amt)
	{
		policy pole;
		int i;
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//put to use template class ya to family members k basis pe search karu ya fir customer k basis pepolicy nikal lo....
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//supposing nikal gaya policy pole me;
		i=search(c,c1);
		ob.claims(p[i],amt);

 	}
	void showdetail(customer c1)
	{
		policy pole;
		int i;
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//put to use template class ya to family members k basis pe search karu ya fir customer k basis pepolicy nikal lo....
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//supposing nikal gaya policy pole me;
		i=search(c,c1);
		ob.showdetail(p[i]);		
	}
	void paypremamt(customer c1)
	{
		policy pole;
		int i;
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//put to use template class ya to family members k basis pe search karu ya fir customer k basis pepolicy nikal lo....
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//supposing nikal gaya policy pole me;
		i=search(c,c1);
		ob.paypremamt(p[i]);	
	}
}