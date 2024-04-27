using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Mover : MonoBehaviour
{
    float vel = 0.01f;

    // Update is called once per frame
    void Update()
    {
        // Deixar como lição de casa normalizar a movimentação.
        if (Input.GetKey(KeyCode.W))
        {
            transform.Translate(Vector3.forward * vel); // Vector3(0, 0, 1)
        }
        if(Input.GetKey("s")){
            transform.Translate(Vector3.back * vel); // Vector3(0, 0, -1)
        }    
        if(Input.GetKey("a")){
            transform.Translate(Vector3.left * vel); // Vector3(-1, 0, 0)
        }
        if(Input.GetKey("d")){
            transform.position += new Vector3(1, 0, 0) * vel; // Vector3.right
        }
    }
}
