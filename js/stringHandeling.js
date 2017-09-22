function processFile(inputFile) {
  var fs = require('fs'),
  readline = require('readline'),
  instream = fs.createReadStream(inputFile),
  outstream = new (require('stream'))(),
  rl = readline.createInterface(instream, outstream);
  var indexCount = 0;
  var showCount = 0;

  rl.on('line', function (line) {

    if(line) {
      var firstIndex = line.indexOf("SprintsController#");
      // return back from here if no match in that line
      if(firstIndex === -1) {
        return;
      }

      var secondIndex = line.indexOf(" ", firstIndex);
      if(secondIndex == -1) {
        return;
      }

      var key = line.substring(firstIndex + 18, secondIndex);
      if(key === 'index'){
        indexCount ++;
      }else if(key === 'show'){
        showCount ++;
      }
    }
  });

  rl.on('close', function (line) {
    console.log("SprintsController with action index found=>>>  "+  indexCount);
    console.log("SprintsController with action show found==>>> "+  showCount);

  });
}
processFile('/Users/tarunsharma-xft/Desktop/logs.txt');
