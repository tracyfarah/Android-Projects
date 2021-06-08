import 'package:csc498_finalexam_flutter/ListScreen.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Sneaker Store',
      theme: ThemeData(primaryColor: Color.fromARGB(255, 199, 0, 5)),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  String _title = 'Sneaker Store';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        title: Text(_title),
      ),
      body: Center(
        child: Column(
          children: [
            Padding(
              padding: const EdgeInsets.symmetric(vertical:50.0 ),
              child: SizedBox(
                width: double.infinity,
                child: Image.asset(
                  'images/logo.jpg',
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.symmetric(vertical: 50.0),
              child: ConstrainedBox(
                constraints: BoxConstraints.tightFor(width: 120.0, height: 50.0),
                child: ElevatedButton(
                  onPressed: () {
                    Navigator.push(context,
                        MaterialPageRoute(builder: (context) => ListScreen()));
                  },
                  style: ButtonStyle(
                      backgroundColor: MaterialStateProperty.all(
                          Color.fromARGB(255, 199, 0, 5))),
                  child: Text(
                    "Find a Pair",
                    style: TextStyle(color: Colors.black, fontSize: 16, fontWeight: FontWeight.bold),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
