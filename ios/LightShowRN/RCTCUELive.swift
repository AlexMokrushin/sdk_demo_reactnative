//
//  RCTCUELive.swift
//  LightShowRN
//
//  Created by Steven Rudenko on 21/5/21.
//

import Foundation
import UIKit
import CUELive

@objc(RCTCUELive)
class RCTCUELive: NSObject {

  @objc static func requiresMainQueueSetup() -> Bool {
      return false
  }
  
  @objc func launchLightShowGUI() {
      DispatchQueue.main.async {
          let initialController = NavigationManager.initialController()
          initialController.modalPresentationStyle = .overFullScreen
          
          let rootViewController:UIViewController?
                = UIApplication.shared.delegate?.window??.rootViewController!
          rootViewController?.present(initialController, animated: true)
      }
  }

}
