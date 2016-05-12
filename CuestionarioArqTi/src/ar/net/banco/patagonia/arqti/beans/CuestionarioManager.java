package ar.net.banco.patagonia.arqti.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import ar.net.banco.patagonia.arqti.entities.CuestionarioItem;
import ar.net.banco.patagonia.arqti.service.CuestionarioService;


@ManagedBean(name="cuestionarioManager")
@ViewScoped
public class CuestionarioManager implements Serializable{
	
	
	private List<CuestionarioItem> cuestionario;

    @ManagedProperty("#{cuestionarioService}")
    private CuestionarioService service;
	
    
    @PostConstruct
    public void init() {
    	
    	cuestionario = service.getCuestionario(1);
    }
    
    
    public List<CuestionarioItem> getCuestionario() {
        return cuestionario;
    }
 
    public void setService(CuestionarioService service) {
        this.service = service;
    }
    /*
    
	public List<CuestionarioItem> getCuestionario() {
		CuestionarioDao cuestionarioDao = new CuestionarioDao();
		cuestionario = cuestionarioDao.leerCuestionario(1);
		return cuestionario;
	}

	public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }*/
}
