1) Probar que un árbol generacional de n generaciones tiene a lo sumo 2<sup>n</sup>-1 personas.

Un árbol t<sub>i</sub> está compuesto por una raíz r<sub>i</sub> y dos subárboles t_left<sub>i-1</sub> y t_right<sub>i-1</sub>

Casos base:
	
* **Length[**{}**]** = 0

* La longitud de un nodo r<sub>j</sub> es **Length[**r<sub>j</sub>**]** = 1 = 2 <sup>0</sup>


Prueba:

**Length[**t<sub>n</sub>**]** = **Length[**t_left<sub>n-1</sub>**]** + **Length[**t_right<sub>n-1</sub>**]** + **Length[**r<sub>n</sub>**]**

= **Length[**t_left<sub>n-1</sub>**]** + **Length[**t_right<sub>n-1</sub>**]** + 1 

= **Length[**t_left<sub>n-1</sub>**]** + **Length[**t_right<sub>n-1</sub>**]** + 2<sup>1</sup>-1

= **Length[**r<sub>n-1</sub> + t_right<sub>n-2</sub> + t_left<sub>n-2</sub>**]** + **Length[**r'<sub>n-1</sub> + t_right'<sub>n-2</sub> + t_left'<sub>n-2</sub>**]** + 2<sup>1</sup>-1

= 1 + **Length[**t_right<sub>n-2</sub>**]** + **Length[**t_left<sub>n-2</sub>**]** + 1 + **Length[**t_right'<sub>n-2</sub>**]** + **Length[**t_left'<sub>n-2</sub>**]** + 2<sup>1</sup>-1

= **Length[**t_right<sub>n-2</sub>**]** + **Length[**t_left<sub>n-2</sub>**]** + **Length[**t_right'<sub>n-2</sub>**]** + **Length[**t_left'<sub>n-2</sub>**]** + ( 1 + 1 + 2<sup>1</sup>-1 )

= **Length[**t_right<sub>n-2</sub>**]** + **Length[**t_left<sub>n-2</sub>**]** + **Length[**t_right'<sub>n-2</sub>**]** + **Length[**t_left'<sub>n-2</sub>**]** + 2<sup>2</sup>-1

   ...     siguiendo asi hasta la generación 0 

= **Length[**{}**]** + ... + **Length[**{}**]** + 2<sup>n</sup>-1

= 0 + 0 + ... + 2<sup>n</sup>-1

Esto vale para un arbol completo, donde cada nodo tiene 2 predecesores siempre, entonces podemos decir que:

**Máx[Length[**t<sub>n</sub>**]]** = 2<sup>n</sup>-1