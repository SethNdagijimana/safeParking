// var grobalUrl = "http://192.168.0.105:8080/"
(() => {
  $.ajax({
    url: "http://192.168.0.105:8080/safeParking/findAll",
    type: "GET",
    dataType: "JSON",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
      "Access-Control-Allow-Origin": "*",
    },
    mode: "no-cors",
    success: function (data) {
      var element = "";
      // console.log(data)
      //   var dd = JSON.parse(JSON.stringify(data));
      $.each(data, function (y, x) {
        element += `<tr><td>${y + 1}</td><td>${x.ownerName}</td><td>${
          x.plateNo
        }</td><td>${x.telephone}</td><td>${x.ownerEmail}</td></tr>`;
      });
      document.querySelector(".table-rows").innerHTML = element;
      //   $("#carTable").html(element);
    },
    error: function (error) {
      console.log(error);
    },
  });
})();

function createCar() {
  $.ajax({
    url: "http://192.168.0.105:8080/SafeParking/newCar",
    method: "POST",
    // dataType: "JSON",
    headers: {
      "Accept": "application/json",
      "Content-Type": "application/json",
      "Access-Control-Allow-Origin": "*",
    },
    data: JSON.stringify({
      ownerName: $("#ownerName").val(),
      ownerEmail: $("#ownerEmail").val(),
      telephone: $("#telephone").val(),
      plateNo: $("#plateNo").val(),
    }),
    mode: "no-cors",
    success: function (data) {
      alert("success!");
    },
    error: function (error) {
      console.log(error);
    },
  });
}
