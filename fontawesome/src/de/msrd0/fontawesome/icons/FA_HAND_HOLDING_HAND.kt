/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_HAND_HOLDING_HAND: Icon {
	
	override val name get() = "Hand Holding-hand"
	
	override val unicode get() = "e4f7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M328.7 52.28L431.7 119.8C449.5 132.9 453.3 157.9 440.2 175.7C427.1 193.5 402.1 197.3 384.3 184.2L296.6 127.1H191.1C183.2 127.1 175.1 135.2 175.1 143.1C175.1 152.7 183.2 159.1 191.1 159.1H254.2C270.2 159.1 284.1 170.9 287.6 186.6C290.8 206.6 275.5 223.1 255.1 223.1H143.1C116.1 223.1 90.87 214.7 69.87 197.7L23.37 159.1L15.1 160C7.25 160 0 152.7 0 143.1V47.99C0 39.25 7.25 32 15.1 32H266.1C289 32 310.9 39.19 328.7 52.28L328.7 52.28zM151.3 459.7L16.27 360.2C-1.509 347.1-5.305 322.1 7.803 304.3C20.93 286.5 45.94 282.7 63.74 295.8L183.4 384H304C312.8 384 320 376.8 320 368C320 359.3 312.8 352 304 352H225.8C209.8 352 195 341.1 192.4 325.4C189.2 305.4 204.5 288 224 288H352C379 288 405.1 297.3 426.1 314.3L472.6 352L496 352C504.7 352 512 359.3 512 368V464C512 472.8 504.7 480 496 480H213C190.1 480 169.1 472.8 151.3 459.7V459.7z"/></svg>"""
		else -> null
	}
	
}
