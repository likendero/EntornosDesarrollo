/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author liken
 */
public    class Fecha    {
private    int    dia;
private    int    mes;
private    int    anio;
public    Fecha(int    dia,    int    mes,    int    anio)    {
this.dia    =    dia;
this.mes    =    mes;
this.anio    =    anio;
}
public    boolean    valida()    {
if    ( numeroDia())    return false;
if    ( numeroMes())    return false;
//    determinamos    la    cantidad    de    días    del    mes:
int    diasMes    =    0;
switch    (mes)    {
case    1:
case    3:
case    5:
case    7:
case    8:
case    10:
case    12:
diasMes    =    31;
break;
case    4:
case    6:
case    9:
case    11:
diasMes    =    30;
break;
case    2:
        diasMes = bisiesto();
break;
}
        return dentroRango(diasMes);
}
//    ...    más    métodos

    private boolean numeroMes() {
        if (mes    <    1    ||    mes    >    12) {
            return true;
        }
        return false;
    }

    private boolean numeroDia() {
        if (dia  <    1    ||    dia    >    31) {
            return true;
        }
        return false;
    }

    private boolean dentroRango(int diasMes) {
        if    (dia    >    diasMes)    {
            return    false;
        }    else    {
            return    true;
        }   }

    private int bisiesto() {
        int diasMes;
        //    verificación    de    año    bisiesto
        if    ((anio    %    400    ==    0)    ||    ((anio    %    4    ==    0)    &&    (anio    %    100    !=    0)))    {
            diasMes    =    29;
        }    else    {
            diasMes    =    28;
        }       return diasMes;
    }
}
