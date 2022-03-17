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

object FA_PANORAMA: Icon {
	
	override val name get() = "Panorama"
	
	override val unicode get() = "e209"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M578.2 66.06C409.8 116.6 230.2 116.6 61.8 66.06C31 56.82 0 79.88 0 112v319.9c0 32.15 30.1 55.21 61.79 45.97c168.4-50.53 347.1-50.53 516.4-.002C608.1 487.2 640 464.1 640 431.1V112C640 79.88 609 56.82 578.2 66.06zM128 224C110.3 224 96 209.7 96 192s14.33-32 32-32c17.68 0 32 14.33 32 32S145.7 224 128 224zM474.3 388.6C423.4 380.3 371.8 376 320 376c-50.45 0-100.7 4.043-150.3 11.93c-14.14 2.246-24.11-13.19-15.78-24.84l49.18-68.56C206.1 290.4 210.9 288 216 288s9.916 2.441 12.93 6.574l32.46 44.51l93.3-139.1C357.7 194.7 362.7 192 368 192s10.35 2.672 13.31 7.125l109.1 165.1C498.1 375.9 488.1 390.8 474.3 388.6z"/></svg>"""
		else -> null
	}
	
}
