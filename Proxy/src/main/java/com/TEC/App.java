package com.TEC;

import com.TEC.inter.ICuenta;
import com.TEC.inter.impl.CuentaBancoBImpl;
import com.TEC.model.Cuenta;
import com.TEC.proxy.CuentaProxy;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "TEC", 100);
		
		//ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		ICuenta cuentaProxy = new CuentaProxy();
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}
