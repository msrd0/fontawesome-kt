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

object FA_BEZIER_CURVE: Icon {
	
	override val name get() = "Bezier Curve"
	
	override val unicode get() = "f55b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M352 32C378.5 32 400 53.49 400 80V84H518.4C528.8 62.69 550.7 48 576 48C611.3 48 640 76.65 640 112C640 147.3 611.3 176 576 176C550.7 176 528.8 161.3 518.4 140H451.5C510.4 179.6 550.4 244.1 555.5 320H560C586.5 320 608 341.5 608 368V432C608 458.5 586.5 480 560 480H496C469.5 480 448 458.5 448 432V368C448 341.5 469.5 320 496 320H499.3C493.4 253 450.8 196.6 391.8 170.9C383.1 183.6 368.6 192 352 192H288C271.4 192 256.9 183.6 248.2 170.9C189.2 196.6 146.6 253 140.7 320H144C170.5 320 192 341.5 192 368V432C192 458.5 170.5 480 144 480H80C53.49 480 32 458.5 32 432V368C32 341.5 53.49 320 80 320H84.53C89.56 244.1 129.6 179.6 188.5 140H121.6C111.2 161.3 89.3 176 64 176C28.65 176 0 147.3 0 112C0 76.65 28.65 48 64 48C89.3 48 111.2 62.69 121.6 84H240V80C240 53.49 261.5 32 288 32H352zM296 136H344V88H296V136zM88 376V424H136V376H88zM552 424V376H504V424H552z"/></svg>"""
		else -> null
	}
	
}
