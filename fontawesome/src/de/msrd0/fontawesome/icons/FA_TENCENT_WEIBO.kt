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

object FA_TENCENT_WEIBO: Icon {
	
	override val name get() = "Tencent Weibo"
	
	override val unicode get() = "f1d5"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M72.3 495.8c1.4 19.9-27.6 22.2-29.7 2.9C31 368.8 73.7 259.2 144 185.5c-15.6-34 9.2-77.1 50.6-77.1 30.3 0 55.1 24.6 55.1 55.1 0 44-49.5 70.8-86.9 45.1-65.7 71.3-101.4 169.8-90.5 287.2zM192 .1C66.1.1-12.3 134.3 43.7 242.4 52.4 259.8 79 246.9 70 229 23.7 136.4 91 29.8 192 29.8c75.4 0 136.9 61.4 136.9 136.9 0 90.8-86.9 153.9-167.7 133.1-19.1-4.1-25.6 24.4-6.6 29.1 110.7 23.2 204-60 204-162.3C358.6 74.7 284 .1 192 .1z"/></svg>"""
		else -> null
	}
	
}
