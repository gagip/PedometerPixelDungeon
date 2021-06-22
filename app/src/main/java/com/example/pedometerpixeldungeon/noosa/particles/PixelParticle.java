/*
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.example.pedometerpixeldungeon.noosa.particles;

import com.example.pedometerpixeldungeon.noosa.Game;
import com.example.pedometerpixeldungeon.noosa.PseudoPixel;

public class PixelParticle extends PseudoPixel {

	protected float size;
	
	protected float lifespan;
	protected float left;
	
	public PixelParticle() {
		super();
		
		origin.set( +0.5f );
	}
	
	public void reset( float x, float y, int color, float size, float lifespan ) {
		revive();
		
		this.x = x;
		this.y = y;
		
		color( color );
		size( this.size = size );
			
		this.left = this.lifespan = lifespan;
	}
	
	@Override
	public void update() {
		super.update();

		if ((left -= Game.elapsed) <= 0) {
			kill();
		}
	}
	
	public static class Shrinking extends PixelParticle {
		@Override
		public void update() {
			super.update();
			size( size * left / lifespan );
		}
	}
}
