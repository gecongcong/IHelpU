<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-us">
    <head>
    	<title>欢迎页面</title>

    	<!-- meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <!-- stylesheet -->
        <link rel="stylesheet" href="guidePage/css/bootstrap.min.css">
        <link rel="stylesheet" href="guidePage/css/font-awesome.min.css">
        <link rel="stylesheet" href="guidePage/css/owl.carousel.css">
		<link rel="stylesheet" href="guidePage/css/owl.theme.min.css">
        <link rel="stylesheet" href="guidePage/css/animate.css">
		<link rel="stylesheet" href="guidePage/css/main.css">

		<!-- google font -->
        <link href='http://fonts.useso.com/css?family=Oswald:300,400' rel='stylesheet'>
        <link href='http://fonts.useso.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
        <link href='http://fonts.useso.com/css?family=PT+Sans' rel='stylesheet' type='text/css'>
        <link href='http://fonts.useso.com/css?family=Roboto+Condensed:400,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.useso.com/css?family=Oxygen:400,300' rel='stylesheet' type='text/css'>
        <link href="http://fonts.useso.com/css?family=Rouge+Script" rel="stylesheet" type="text/css">
        <link href='http://fonts.useso.com/css?family=Milonga' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="content-block" id="header">
            <div id="overlay-1">
                <header id="site-header" class="clearfix">
                    <div class="pull-left">
                        <h1><a href="#">我帮你</a></h1>
                    </div>
                    <div class="pull-right">
                        <nav class="navbar site-nav" role="navigation">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                    <i class="fa fa-bars fa-2x"></i>
                                </button>
                            </div>

                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                <ul class="nav navbar-nav">
                                    <li class="active"><a href="#header" style="font-family:SimHei;color:white"><i class="fa fa-home"></i>&nbsp;主页</a></li>
                                    <li><a href="#testimonials" style="font-family:SimHei;color:white"><i class="fa fa-thumbs-up"></i>&nbsp;每周榜单</a></li>
                                </ul>
                            </div>  <!-- /.navbar-collapse -->
                        </nav>
                    </div>
                </header>	<!-- site-header -->
                
                <div class="middle text-center clearfix">
                    <div class="container"><!-- 大标题 -->
                        <h1 class="pro-name">我帮你</h1>
                        <p class="tagline">I can help you</p>
                        <br>
                        <div class="skills">
                        </div>  <!-- skills -->
                        <a href="MerchantLogin.jsp" target="_parent" class="btn btn-lg btn-hire wow animated zoomIn"> 商家入口 </a>
                        <br><br><br>
                        <a href="EmployeeLogin.jsp" target="_parent" class="btn btn-lg btn-hire wow animated zoomIn">外卖侠入口</a>
                    </div>  <!-- container -->
                </div>  <!-- middle -->
                
                <div class="bottom text-center">
                    <a href="#portfolio"><i class="fa fa-angle-down fa-3x pulse"></i></a>
                </div>
            </div>  <!-- overlay-1 -->
        </div>  <!-- content-block -->

        <div class="content-block" id="testimonials">
            <header class="block-heading cleafix text-center">
                <h1>What Clients Say</h1>
                <!-- <p>Lorem Ipsum Text</p> -->
            </header>
            <div class="block-content text-center">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-md-offset-3">
                        	<div class="owl-carousel">
								<div class="owl-item">
									<div class="testimonial">
                                        <img alt="Client Photo" src="guidePage/img/testimonial_31-190x190.jpg">
                                        <p>In at accumsan risus. Nam id volutpat ante. Etiam vel mi mattis, vulputate nunc nec, sodales nibh. Etiam nulla magna, gravida eget ultricies sit amet.</p>
                                        <strong>Jhon Doe</strong><br>
                                        <span>Head of Ideas, Technext</span>
                                    </div>
								</div>	<!-- owl-item -->
								<div class="owl-item">
									<div class="testimonial">
                                        <img alt="Client Photo" src="guidePage/img/testimonial_11-190x190.jpg">
                                        <p>In at accumsan risus. Nam id volutpat ante. Etiam vel mi mattis, vulputate nunc nec, sodales nibh. Etiam nulla magna, gravida eget ultricies sit amet.</p>
                                        <strong>Jane Doe</strong><br>
                                        <span>CEO, Apple Inc</span>
                                    </div>
								</div>	<!-- owl-item -->
								<div class="owl-item">
									<div class="testimonial">
                                        <img alt="Client Photo" src="guidePage/img/testimonial_22-190x190.jpg">
                                        <p>In at accumsan risus. Nam id volutpat ante. Etiam vel mi mattis, vulputate nunc nec, sodales nibh. Etiam nulla magna, gravida eget ultricies sit amet.</p>
                                        <strong>Albert Doe</strong><br>
                                        <span>Team Lead, Design Studio</span>
                                    </div>
								</div>	<!-- owl-item -->
							</div>	<!-- owl-carousel -->
						</div>	<!-- col-md-12 -->
                    </div>	<!-- row -->
                </div>	<!-- container -->
            </div>	<!-- block-content -->
        </div>	<!-- content-block -->

        <footer id="site-footer">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="copyright">
                        	<p>Copyright &copy; 2015 我帮你项目开发小组</p>
                        </div>
                    </div>
                </div>
            </div>
        </footer><!-- site-footer -->

        <!-- js -->
        <script>
            new WOW().init();
        </script>

        <script src="guidePage/js/jquery-2.1.3.min.js"></script>
        <script src="guidePage/js/bootstrap.min.js"></script>
        <script src="guidePage/js/jquery.actual.min.js"></script>
        <script src="guidePage/js/isotope.pkgd.min.js"></script>
        <script src="guidePage/js/owl.carousel.min.js"></script>
        <script src="guidePage/js/jquery.isonscreen.js"></script>
        <script src="guidePage/js/main.js"></script>

        <script>
        	$(document).ready(function(){
  				$('.owl-carousel').owlCarousel({
    				loop:true,
    				margin:10,
    				autoplay:true,
    				autoplayTimeout:3000,
    				autoplayHoverPause:true,
    				responsiveClass:true,
    				responsive:{
        					0:{
					            items:1,
        					},
					        600:{
					            items:1,
					        },
					        1000:{
					            items:1,
					        }
    				}
				})
			});
        </script>
        
	</body>
</html>
