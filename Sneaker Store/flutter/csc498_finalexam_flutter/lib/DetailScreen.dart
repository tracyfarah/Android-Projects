import 'package:flutter/material.dart';

import 'Sneaker.dart';

class DetailScreen extends StatelessWidget {
  final Sneaker sneaker;

  const DetailScreen({Key key, this.sneaker}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        title: Text(sneaker.name),
      ),

        body: Column(
          children: [
            SizedBox(
              width: double.infinity,
              child: Image.asset(
                sneaker.imageResource,
                fit: BoxFit.fill,
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Center(
                child: Text(
                  sneaker.name,
                  style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
                ),
              ),
            ),
            Padding(
              padding:
                  const EdgeInsets.symmetric(vertical: 20.0, horizontal: 20.0),
              child: Text(
                sneaker.description,
                style: TextStyle(fontSize: 18, fontStyle: FontStyle.italic),
              ),
            ),
            Text(
              'Retail Price: ' + sneaker.retailPrice,
              style: TextStyle(fontSize: 18, fontStyle: FontStyle.italic),
            ),
          ],
        ),

    );
  }
}
