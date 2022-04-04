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

/** Earth Oceania */
object FA_EARTH_OCEANIA: Icon {
	
	override val name get() = "Earth Oceania"
	
	override val unicode get() = "e47b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM215.5 360.6L240.9 377C247.1 381.6 256.2 384 264.6 384C278 384 290.7 377.8 298.1 367.2L311 351.8C316.8 344.4 320 335.2 320 325.8C320 316.4 316.8 307.2 311 299.8L293.1 276.9C288.3 270.7 284.4 263.1 281.6 256.7L271.5 230.8C269.9 226.7 265.9 224 261.5 224C258 224 254.8 225.6 252.8 228.4L242.4 242.6C237.7 248.1 229.7 252.1 221.9 250.5C218.7 249.8 215.8 247.1 213.8 245.4L209.3 239.3C202.1 229.7 190.7 224 178.7 224C166.7 224 155.3 229.7 148.1 239.3L142.8 246.3C141.3 248.4 139.2 250 136.9 251.1L101.6 267.9C81.08 277.7 72.8 302.6 83.37 322.7L86.65 328.9C95.67 346.1 115.7 354.3 134.1 348.4L149.5 343.6C156 341.5 163.1 341.6 169.6 343.8L208.6 357.3C211 358.1 213.4 359.2 215.5 360.6H215.5zM273.8 142.5C264.3 132.1 250.8 128.9 237.6 131.5L199.1 139.2C183.8 142.3 181.5 163.2 195.7 169.5L238.5 188.6C243.7 190.8 249.2 192 254.8 192H284.7C298.9 192 306.1 174.8 296 164.7L273.8 142.5zM264 448H280C288.8 448 296 440.8 296 432C296 423.2 288.8 416 280 416H264C255.2 416 248 423.2 248 432C248 440.8 255.2 448 264 448zM431.2 298.9C428.4 290.6 419.3 286 410.9 288.8C402.6 291.6 398 300.7 400.8 309.1L408.8 333.1C411.6 341.4 420.7 345.1 429.1 343.2C437.4 340.4 441.1 331.3 439.2 322.9L431.2 298.9zM411.3 379.3C417.6 373.1 417.6 362.9 411.3 356.7C405.1 350.4 394.9 350.4 388.7 356.7L356.7 388.7C350.4 394.9 350.4 405.1 356.7 411.3C362.9 417.6 373.1 417.6 379.3 411.3L411.3 379.3z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_EARTH_OCEANIA]. */
val FA_GLOBE_OCEANIA = FA_EARTH_OCEANIA