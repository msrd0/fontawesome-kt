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

/** Bridge Circle-exclamation */
object FA_BRIDGE_CIRCLE_EXCLAMATION: Icon {
	
	override val name get() = "Bridge Circle-exclamation"
	
	override val unicode get() = "e4ca"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M576 32C593.7 32 608 46.33 608 64C608 81.67 593.7 96 576 96H536V160H608V232.2C577.6 207.1 538.5 192 496 192C426.9 192 367.1 231.8 338.3 289.7C332.4 288.6 326.3 288 320 288C266.1 288 224 330.1 224 384V448C224 465.7 209.7 480 192 480H160C142.3 480 128 465.7 128 448V384C128 330.1 85.02 288 32 288V160H104V96H64C46.33 96 32 81.67 32 64C32 46.33 46.33 32 64 32H576zM488 96H408V160H488V96zM280 96V160H360V96H280zM232 96H152V160H232V96zM352 368C352 288.5 416.5 224 496 224C575.5 224 640 288.5 640 368C640 447.5 575.5 512 496 512C416.5 512 352 447.5 352 368zM496 464C509.3 464 520 453.3 520 440C520 426.7 509.3 416 496 416C482.7 416 472 426.7 472 440C472 453.3 482.7 464 496 464zM479.1 288V368C479.1 376.8 487.2 384 495.1 384C504.8 384 511.1 376.8 511.1 368V288C511.1 279.2 504.8 272 495.1 272C487.2 272 479.1 279.2 479.1 288z"/></svg>"""
		else -> null
	}
	
}
