package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame implements ApplicationListener {
	
	private Texture textura; //Declaramos la textura que es la imagen.
	private OrthographicCamera camara; //Declaramos la c�mara para mostrar im�genes.
	private SpriteBatch spriteb;
	
	
	
	//M�todo Create  del juego.
	@Override
	public void create() {		
	
		//Rescatamos el tama�o de la ventana que hemos creado independientemente
		//del dispositivo rescatandolo de los proyectos.
		int w = Gdx.graphics.getWidth();
		int h = Gdx.graphics.getHeight();
		
		//Creamos la c�mara del tama�o de la ventana.
		camara = new OrthographicCamera(w,h);
		spriteb = new SpriteBatch();
		
		//Creamos la textura y cargamos la imagen mediante el procedimiento siguiente
		//dado que se encuentra dentro del proyecto.
		textura = new Texture(Gdx.files.internal("data/images1.png"));
		
		
	}

	
	//M�todo para eliminar de memoria aquellos objetos que por si java 
	// no elimina.
	@Override
	public void dispose() {
		spriteb.dispose(); //M�todo para eliminar el SpriteBatch.
		textura.dispose(); //M�todo para eiliminar la Textura.
	}

	
	//M�todo para diburjar en pantalla.
	@Override
	public void render() {		
		//Indicamos el color con el que queremos eliminar la pantalla.
		Gdx.gl.glClearColor(1, 1, 1, 1);
		
		//Eliminamos la pantalla utilizando la funci�n de opengl.
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		//Indicamos al spritebatch que empezamos.
		spriteb.begin();
		//Dibujamos el spritebatch en la posici�n 0,0
		spriteb.draw(textura,0,0);
		//Y le indicamos con �ste m�todo que finalizamos.
		spriteb.end();
	
		
	}

	
	//M�todo para indicar a la ventan que hacer cuando se redimensiona.
	@Override
	public void resize(int width, int height) {
	}
	
	//M�todo para �ndicar al sistema que hacer cuando el juego entra ne modo pausa.
	@Override
	public void pause() {
	}

	//M�todo para indicar al juego que hacer cuanod vuelve a iniciarse despu�s de una 
	//pausa.
	@Override
	public void resume() {
	}
}
