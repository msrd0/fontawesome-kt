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

object FA_RULER_HORIZONTAL: Icon {
	
	override val name get() = "Ruler Horizontal"
	
	override val unicode get() = "f547"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M0 176C0 149.5 21.49 128 48 128H112V208C112 216.8 119.2 224 128 224C136.8 224 144 216.8 144 208V128H208V208C208 216.8 215.2 224 224 224C232.8 224 240 216.8 240 208V128H304V208C304 216.8 311.2 224 320 224C328.8 224 336 216.8 336 208V128H400V208C400 216.8 407.2 224 416 224C424.8 224 432 216.8 432 208V128H496V208C496 216.8 503.2 224 512 224C520.8 224 528 216.8 528 208V128H592C618.5 128 640 149.5 640 176V336C640 362.5 618.5 384 592 384H48C21.49 384 0 362.5 0 336V176z"/></svg>"""
		else -> null
	}
	
}
