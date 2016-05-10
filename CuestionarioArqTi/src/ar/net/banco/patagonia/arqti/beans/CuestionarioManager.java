package ar.net.banco.patagonia.arqti.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;

import ar.net.banco.patagonia.arqti.dao.CuestionarioDao;
import ar.net.banco.patagonia.arqti.entities.CuestionarioItem;



@ManagedBean(name="cuestionarioManager")
@SessionScoped
public class CuestionarioManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CuestionarioItem> cuestionario = new ArrayList<CuestionarioItem>();

	
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
    }
}
