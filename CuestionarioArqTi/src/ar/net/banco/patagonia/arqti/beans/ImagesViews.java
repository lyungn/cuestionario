package ar.net.banco.patagonia.arqti.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import ar.net.banco.patagonia.arqti.entities.ProyectImage;
 

@ManagedBean
public class ImagesViews {
	private List<ProyectImage> images;
    
	@PostConstruct
    public void init() {
        images = new ArrayList<ProyectImage>();
        for (int i = 1; i <= 4; i++) {
        	ProyectImage image = new ProyectImage();
        	image.setImageName("pic0" + i + ".png");
        	image.setProyectName("TEST");
        	image.setProyectoImageId(i);
            images.add(image);
        }
    }
 
    public List<ProyectImage> getImages() {
        return images;
    }

}
