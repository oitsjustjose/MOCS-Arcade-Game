package com.github.capstone.Scene.Menus;

import com.github.capstone.Scene.Components.Button;
import com.github.capstone.Scene.Game;
import com.github.capstone.Scene.UserGuide.Page1;
import com.github.capstone.Util.Textures;

public class MainMenu extends Menu
{
    private Game game;
    private Options options;
    private Page1 tutorial;

    public MainMenu()
    {
        super(Textures.TITLE);
        this.game = new Game();
        this.options = new Options(this);
        this.tutorial = new Page1(this);
        this.addButton(new Button(256, 64, "Play Co-Op"), game);
        this.addButton(new Button(256, 64, "Options"), options);
        this.addButton(new Button(256, 64, "Tutorial"), tutorial);
        this.addButton(new Button(256, 64, "Quit Game"), null);
        this.adjustButtons();
    }

    @Override
    public void resizeContents()
    {
        game.resizeContents();
        tutorial.resizeContents();
        this.adjustButtons();
    }

    public void recolor()
    {
        this.game.recolor();
        this.tutorial.recolor();
    }
}
