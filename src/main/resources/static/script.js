$(document).ready(()=>{
    const $container = $("#container_cadastro");
    const $submit = $('#submit');


    function verificarCamposPreenchidos() {
        const $inputs = $container.find('input[type="text"], input[type="password"], input[type="email"]');
        return $inputs.toArray().every(input => input.value.trim() !== ''); 
    }

    $submit.on("mouseenter", () => {


         if (verificarCamposPreenchidos()) {
            
            $submit.prop('disabled', true);
            
        } else {
            $submit.animate({
                marginLeft: '150px'
      }).on("mouseleave", () => {
            $submit.animate({
                marginLeft: '0', 
                
                 }); 
                }).on("mouseenter", () => {
                    $submit.delay(0).animate({
                        marginLeft: '150px'
              })
                }) }

})})

$(document).ready(function() {
    $('.completed-checkbox').change(function() {
        const activity = $(this).parent();
        if ($(this).prop('checked')) {
            activity.addClass('completed');
        } else {
            activity.removeClass('completed');
        }
    });
});