package lib;

public class MM1_lib {

  private double lambda,mu,rho;

public MM1_lib(double lambda,double mu) {
	this.lambda=lambda;
	this.mu=mu;
	rho=lambda/mu;
	// TODO Auto-generated constructor stub
}

public double getRho(){
	return rho;
	}
public double getLenght(){//•½‹ÏŒnl”
	return (rho/(1-rho));
    }
public double getQueue(){//•½‹Ï‘Ò‚¿l”
	return (Math.pow(rho,2)/(1-rho)); 
    }
public double getTime(){//•½‹ÏŒn“àŠÔ
	return 1/(1-rho)*1/mu;
    }
public double getWtime(){//•½‹Ï‘Ò‚¿ŠÔ
	return rho/(1-rho)*1/mu;
    }


}
