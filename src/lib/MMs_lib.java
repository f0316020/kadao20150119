package lib;

public class MMs_lib {
	
	private double lmabda,mu,rho;
	private int s;
	private double alpha;

	public MMs_lib(double lambda,double mu,int s){
		this.lmabda=lambda;
		this.mu=mu;
		this.alpha=lambda/mu;
		//this.rho=this.alpha/r;
		this.s=s;
	}
	
	public int getFactrial(int s){
		
		int f = 1;//ŠKæ‚Ì’l
		for(int i=s;i>=0;i--){
		  if(i==0){
			f*=1;
		  }else{
			 f*=i; 
		  }
	    }
		return f;
	}
	
	
	public double getP0(){
      double p0=0,p01=0,p02=0;
      
      for(int k=0;k<this.s;k++){
    	  p01 +=Math.pow(this.alpha, k)/getFactrial(k);
      }
      p02=Math.pow(this.alpha,this.s)/getFactrial(this.s)/(1-this.rho);
      p0 = 1/(p01+p02);
      return p0;

      }
	public double getLq(){
		double lq;
		lq = Math.pow(this.s, this.s)*Math.pow(this.rho, this.s+1)*getP0()/getFactrial(this.s)/Math.pow(1-this.rho, 2);
		return lq;
	}
    public double getL(){
    	double l;
    	l =getLq()+this.alpha;
		return l;
    	
    }
    public double getWq(){
    	double wq = getLq()/this.lmabda;
    	return wq;
    }
    public double getW(){
    	double w=getWq()+1/this.mu;
    	return w;
    }
    public double getrho(){
    	return this.rho;
    }
}