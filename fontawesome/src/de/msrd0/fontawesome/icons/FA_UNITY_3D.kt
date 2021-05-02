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
import de.msrd0.fontawesome.Style.BRANDS

object FA_UNITY_3D: Icon {
	
	override val name get() = "Unity 3D"
	
	override val unicode get() = "e049"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M498.11,206.4,445.31,14.72,248.2,66.08,219,116.14l-59.2-.43L15.54,256,159.82,396.32l59.17-.43,29.24,50,197.08,51.36,52.8-191.62-30-49.63ZM223.77,124.2,374.55,86.51,288,232.33H114.87Zm0,263.63L114.87,279.71H288l86.55,145.81Zm193,14L330.17,256l86.58-145.84L458.56,256Z"/></svg>"""
		else -> null
	}
	
}
