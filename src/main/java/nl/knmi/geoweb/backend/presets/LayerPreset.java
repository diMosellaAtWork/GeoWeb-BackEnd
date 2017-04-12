package nl.knmi.geoweb.backend.presets;

import java.util.Map;

import lombok.Getter;

@Getter
public class LayerPreset{
	private String layer;
	private Map<String,String> dimensions;
	private boolean active;
	private boolean overlay;
	private float opacity;
	public LayerPreset(String layer, Map<String,String> dimensions) {
		this(layer, dimensions, false, true, 1);
	}
	public LayerPreset(){}
	
	public LayerPreset(String layer, Map<String,String> dimensions, boolean overlay, boolean active, float opacity) {
		this.layer=layer;
		this.dimensions=dimensions;
		this.overlay=overlay;
		this.active=active;
		this.opacity=opacity;
	}
}
