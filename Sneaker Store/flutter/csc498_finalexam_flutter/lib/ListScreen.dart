import 'package:flutter/material.dart';
import 'Sneaker.dart';
import 'DetailScreen.dart';

class ListScreen extends StatelessWidget{
  String _title = 'Sneaker Store';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        title: Text(_title),
      ),
      body: ListView.builder(
          itemCount: sneakers.length,
          itemBuilder: (context, index) {
            return Card(
              elevation: 8,
              child: InkWell(
                onTap: () {
                  Navigator.push(context, MaterialPageRoute(builder: (context) {
                    return DetailScreen(sneaker: sneakers[index]);
                  }));
                },
                child: Column(
                  children: [
                    SizedBox(
                        height: 200,
                        width: double.infinity,
                        child: Image.asset(
                          sneakers[index].imageResource,
                          fit: BoxFit.fitWidth,
                        )),
                    Padding(
                      padding: const EdgeInsets.all(4.0),
                      child: Text(
                        sneakers[index].name,
                        style: TextStyle(fontSize: 16),
                      ),
                    ),
                  ],
                ),
              ),
            );
          }),
    );
  }

}