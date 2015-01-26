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
public double getLenght(){//���όn�l��
	return (rho/(1-rho));
    }
public double getQueue(){//���ϑ҂��l��
	return (Math.pow(rho,2)/(1-rho)); 
    }
public double getTime(){//���όn������
	return 1/(1-rho)*1/mu;
    }
public double getWtime(){//���ϑ҂�����
	return rho/(1-rho)*1/mu;
    }


}
