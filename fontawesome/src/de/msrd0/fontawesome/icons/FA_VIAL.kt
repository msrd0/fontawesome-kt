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

/** Vial */
object FA_VIAL: Icon {
	
	override val name get() = "Vial"
	
	override val unicode get() = "f492"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M502.6 169.4l-160-160C336.4 3.125 328.2 0 320 0s-16.38 3.125-22.62 9.375c-12.5 12.5-12.5 32.75 0 45.25l6.975 6.977l-271.4 271c-38.75 38.75-45.13 102-9.375 143.5C44.08 500 72.76 512 101.5 512h.4473c26.38 0 52.75-9.1 72.88-30.12l275.2-274.6l7.365 7.367C463.6 220.9 471.8 224 480 224s16.38-3.125 22.62-9.375C515.1 202.1 515.1 181.9 502.6 169.4zM310.6 256H200.2l149.3-149.1l55.18 55.12L310.6 256z"/></svg>"""
		else -> null
	}
	
}
