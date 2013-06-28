
public class Mapas {
	private int[][] mapa1 = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							 {0,4,1,1,1,1,1,1,1,1,1,3,3,3,1,1,3,3,1,1,1,1,0,5,0},
							 {0,0,0,1,0,1,0,1,0,3,0,3,0,3,0,1,0,3,0,1,0,1,0,1,0},
							 {0,3,3,3,3,1,1,1,1,3,1,1,1,3,1,3,1,3,1,1,1,1,1,1,0},
							 {0,1,0,1,0,3,0,3,0,3,0,1,0,3,0,3,0,3,0,1,0,1,0,1,0},
							 {0,1,1,1,1,3,1,1,1,3,1,1,1,3,1,1,1,3,3,3,1,1,1,1,0},
							 {0,1,0,1,0,3,0,3,0,3,0,1,0,3,0,1,0,1,0,3,0,1,0,1,0},
							 {0,1,1,1,1,3,1,1,1,3,1,1,1,3,1,3,3,3,3,3,1,1,1,1,0},
							 {0,1,0,1,0,3,0,1,0,3,0,1,0,3,0,3,0,1,0,1,0,1,0,1,0},
							 {0,3,3,3,3,3,3,3,3,3,1,1,1,3,1,3,1,1,1,1,1,1,1,1,0},
							 {0,3,0,1,0,1,0,1,0,1,0,3,0,3,0,3,0,1,0,1,0,1,0,1,0},
							 {0,3,1,1,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1,0},
							 {0,3,0,1,0,1,0,1,0,1,0,3,0,1,0,1,0,1,0,1,0,1,0,1,0},
							 {0,3,1,1,1,1,1,1,1,1,1,3,3,3,1,1,1,1,1,1,1,1,1,1,0},
							 {0,3,0,1,0,1,0,1,0,3,0,1,0,3,0,1,0,1,0,1,0,1,0,1,0},
							 {0,3,1,1,1,1,1,1,1,3,1,1,1,3,1,1,1,1,1,3,3,3,3,1,0},
							 {0,3,0,3,0,1,0,1,0,3,0,1,0,3,0,1,0,1,0,3,0,1,0,3,0},
							 {0,3,3,3,1,1,1,1,1,3,1,1,1,3,1,1,1,1,1,3,1,1,1,3,0},
							 {0,1,0,1,0,1,0,1,0,3,0,1,0,3,0,1,0,1,0,3,0,1,0,3,0},
							 {0,1,3,3,1,1,1,1,1,3,1,1,1,3,1,3,3,1,1,3,1,3,3,3,0},
							 {0,3,0,1,0,1,0,1,0,3,0,1,0,3,0,3,0,1,0,3,0,1,0,1,0},
							 {0,3,1,1,1,3,3,3,3,3,1,1,1,3,1,3,1,1,1,3,1,1,1,1,0},
							 {0,3,0,1,0,1,0,1,0,1,0,1,0,3,0,3,0,1,0,3,0,1,0,1,0},
							 {0,1,2,1,1,1,1,1,1,1,1,1,1,3,3,3,1,1,1,3,3,3,3,3,0},
							 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},};
	
	private int[][] mapa2 = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							 {0,4,1,1,1,1,1,1,3,3,3,3,3,1,1,1,1,3,3,1,1,1,1,5,0},
							 {0,1,1,1,1,1,1,0,0,3,3,3,3,1,1,1,1,3,0,0,0,0,0,1,0},
							 {0,1,1,1,1,1,1,0,0,3,3,3,3,1,3,1,1,3,0,0,0,0,0,1,0},
							 {0,0,0,0,0,0,0,0,0,3,3,3,3,1,3,1,1,3,0,0,0,0,0,1,0},
							 {0,0,0,0,0,0,0,0,0,3,3,3,3,1,3,1,1,3,0,0,0,0,0,0,0},
							 {0,1,1,1,1,1,1,1,1,3,3,3,3,1,3,1,1,3,0,1,1,1,0,0,0},
							 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,3,0,1,1,1,0,0,0},
							 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,3,0,0,0,0,0,0,0},
							 {0,1,1,1,3,3,3,3,3,3,3,3,3,3,3,1,1,3,0,0,0,0,0,0,0},
							 {0,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1,3,0,0,0,0,0,0,0},
							 {0,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1,3,0,0,0,0,0,0,0},
							 {0,1,1,1,3,1,1,0,0,0,0,0,0,0,0,1,1,3,0,0,0,0,0,0,0},
							 {0,1,1,1,3,1,1,0,0,0,0,0,0,0,0,1,1,3,1,1,1,1,1,1,0},
							 {0,1,1,1,3,1,1,0,0,0,0,0,0,0,0,1,1,3,1,1,1,1,1,1,0},
							 {0,1,1,1,3,1,1,1,1,0,0,0,0,0,0,1,1,3,1,1,1,1,1,1,0},
							 {0,1,1,1,3,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0},
							 {0,1,1,1,3,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0},
							 {0,1,1,1,3,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0},
							 {0,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
							 {0,3,1,1,1,1,1,1,3,3,3,3,3,3,3,3,1,1,1,3,1,0,0,0,0},
							 {0,3,1,1,1,1,1,1,3,3,3,3,3,3,3,3,1,1,1,3,1,0,0,0,0},
							 {0,3,1,1,1,1,1,1,3,3,3,3,3,3,3,3,1,1,1,1,1,0,0,0,0},
							 {0,3,2,1,1,1,1,1,1,1,1,1,1,3,3,3,1,1,1,3,3,0,0,0,0},
							 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},};
	public int Mapas(int x, int y, int z){
		switch (z){
		case 1:
			return mapa1[x][y]; 
		case 2:
			return mapa2[x][y];
		}
		return z;
	}

}