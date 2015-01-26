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
public double getLenght(){//平均系人数
	return (rho/(1-rho));
    }
public double getQueue(){//平均待ち人数
	return (Math.pow(rho,2)/(1-rho)); 
    }
public double getTime(){//平均系内時間
	return 1/(1-rho)*1/mu;
    }
public double getWtime(){//平均待ち時間
	return rho/(1-rho)*1/mu;
    }


}
